package com.position2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.position2.api")
public class Position2ServicenowApplication {

	public static void main(String[] args) {
		SpringApplication.run(Position2ServicenowApplication.class, args);
	}
}
