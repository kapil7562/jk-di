package com.springframework.jkdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springframework.controllers.ContructorInjectedController;
import com.springframework.controllers.MyController;
import com.springframework.controllers.PropertyInjectedController;
import com.springframework.controllers.SetterInjectedController;

@ComponentScan({"com.springframework"})
@SpringBootApplication
public class JkDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(JkDiApplication.class, args);
		MyController myCotroller = ctx.getBean(MyController.class);
		System.out.println(myCotroller.sayHello());
		
		System.out.println("---- Spring DI Property Based");
		
		PropertyInjectedController propController = ctx.getBean(PropertyInjectedController.class);
		System.out.println(propController.getGreeting());
		
		System.out.println("---- Spring DI Setter Based");
		
		SetterInjectedController setterController = ctx.getBean(SetterInjectedController.class);
		System.out.println(setterController.getGreeting());
		
		System.out.println("---- Spring DI Constructor Based");
		
		ContructorInjectedController consController  = ctx.getBean(ContructorInjectedController.class);
		System.out.println(consController.getGreeting());
	}

}
