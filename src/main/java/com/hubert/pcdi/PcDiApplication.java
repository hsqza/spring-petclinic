package com.hubert.pcdi;

import com.hubert.pcdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PcDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(PcDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
