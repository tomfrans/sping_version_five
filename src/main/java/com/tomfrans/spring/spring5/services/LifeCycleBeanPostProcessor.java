package com.tomfrans.spring.spring5.services;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBeanPostProcessor implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		
		if(bean instanceof LifeCycleService){
			((LifeCycleService) bean).beforeInit();
		}
		return bean;
		
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) {
		if(bean instanceof LifeCycleService){
			((LifeCycleService) bean).afterInit();
		}
		return bean;
		
	}
}
