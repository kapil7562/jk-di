package com.springframework.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean,DisposableBean,BeanNameAware,BeanFactoryAware,ApplicationContextAware{
	
	

	public LifeCycleDemoBean() {
		super();
		System.out.println("I'm in the LifeCycleDemoBean Constructor");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Application Context has been set");
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Bean Factory Aware has been set");
		
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean Name aware has been set");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean has been Terminated");
		
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Post Construct call after the been has setup but before its return to the requesting object");
	}
	
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Pre Destroy call before the been destroyed");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Been After properties set has been called");
	}
	
	public void beforeInit() {
		System.out.println("Bean Post Processor Before initalization");
	}
	
	public void afterInit() {
		System.out.println("Bean Post Processor After initalization");
	}
	
	

}
