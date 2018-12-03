package com.hz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloundDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloundDemoApplication.class, args);
	}

}
