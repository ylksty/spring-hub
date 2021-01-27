package com.ylkget.mqactivemqbootproduce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 是否开启定时
public class MqActivemqBootProduceApplication_6000 {

	public static void main(String[] args) {
		SpringApplication.run(MqActivemqBootProduceApplication_6000.class, args);
	}

}
