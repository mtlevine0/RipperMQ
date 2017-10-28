FROM maven:3.5.0-jdk-8

RUN mkdir /usr/src/rippermq-workspace

WORKDIR /usr/src/rippermq-workspace

ADD . .

WORKDIR /usr/src/rippermq-workspace/rippermq-build
RUN mvn clean package -DskipTests

WORKDIR /usr/src/rippermq-workspace/rippermq-api/target

EXPOSE 8081

CMD java -jar rippermq-api-0.0.1-SNAPSHOT.jar

