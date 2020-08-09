package com.springframework.jkdi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springframework.controllers.ContructorInjectedController;
import com.springframework.controllers.I18NController;
import com.springframework.controllers.MyController;
import com.springframework.controllers.PropertyInjectedController;
import com.springframework.controllers.SetterInjectedController;
import com.springframework.services.Car;
import com.springframework.services.CarService;

@ComponentScan({"com.springframework"})
@SpringBootApplication
public class JkDiApplication {
	

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(JkDiApplication.class, args);
		
		I18NController i18nController = ctx.getBean(I18NController.class);
		
		System.out.println(i18nController.sayGreeting());
		
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
		
		System.out.println("Example of @Order");
		
		CarService carService = ctx.getBean(CarService.class);
		carService.printCarNames();
	}

}
