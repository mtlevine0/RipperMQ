# RipperMQ

## Prereq:
1. docker run -d --hostname my-rabbit --name some-rabbit -p 15672:15672 -p 25672:25672 -p 5672:5672 rabbitmq:3-management -- Run rabbitmq in a container

## Building:
1. mvn clean package (-DskipTests)

## Running:
1. java -jar rippermq-api-0.0.1-SNAPSHOT.jar