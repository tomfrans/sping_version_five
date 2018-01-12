package com.tomfrans.spring.spring5.services;

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
public class LifeCycleService implements InitializingBean,ApplicationContextAware,
BeanNameAware,BeanFactoryAware,DisposableBean{
	
	public LifeCycleService() {
		System.out.println("Starting of LifeCycle Constructor");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet()");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("Inside setApplicationContext");		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy()");		
		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("Inside setBeanFactory"+arg0.toString());	
		
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("Inside setBeanName"+arg0);	
		
	}
	@PostConstruct
	public void postConstruct(){
		System.out.println("Inside postConstruct()");	
	}

	@PreDestroy
	public void preDestroy(){
		System.out.println("Inside preDestroy()");	
	}
	
	public void beforeInit(){
		
		System.out.println("Inside beforeInit()");	
	}
	
	public void afterInit(){
		System.out.println("Inside afterInit()");	
	}
}
