package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 验证问题
 * 1. spring kafka producer consumer学习
 * 2. 方法返回加上@bean注解， 调用多次返回的是同一对象？ druiddatabase 看起来是这样
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
