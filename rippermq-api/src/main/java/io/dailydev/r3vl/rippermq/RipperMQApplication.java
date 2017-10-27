package io.dailydev.r3vl.rippermq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RipperMQApplication {

	public static void main(String[] args) {
		SpringApplication.run(RipperMQApplication.class, args);
		System.out.println("MissionControl API is Running!");
	}
	
}
