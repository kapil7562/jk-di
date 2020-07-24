package com.springframework.jkdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springframework.controllers.MyController;

@ComponentScan("com.springframework.controllers")
@SpringBootApplication
public class JkDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(JkDiApplication.class, args);
		MyController myCotroller = ctx.getBean(MyController.class);
		System.out.println(myCotroller.sayHello());
	}

}
