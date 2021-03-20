package com.ylkget.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ylkget.security.mapper")
public class BootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSecurityApplication.class, args);
	}

}
