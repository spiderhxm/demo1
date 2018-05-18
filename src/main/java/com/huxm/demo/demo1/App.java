package com.huxm.demo.demo1;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		Logger rootlog = Logger.getRootLogger();

		Test1 t1 = new Test1();
		rootlog.info("-----the root info");

		t1.log("add R log");
		
		SpringApplication.run(App.class, args);

	}
}
