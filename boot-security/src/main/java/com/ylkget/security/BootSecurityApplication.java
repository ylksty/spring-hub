package com.ylkget.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@MapperScan("com.ylkget.security.mapper")
@EnableGlobalMethodSecurity(securedEnabled=true, prePostEnabled = true)
public class BootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSecurityApplication.class, args);
	}

}
