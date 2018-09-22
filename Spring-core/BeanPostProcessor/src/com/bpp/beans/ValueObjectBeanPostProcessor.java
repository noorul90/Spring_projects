package com.bpp.beans;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ValueObjectBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obj, String beanname)
			throws BeansException {
		if(obj instanceof AppBaseVO){
			((AppBaseVO)obj).setCreatedDate(new Date());
			((AppBaseVO) obj).setLastModifiedDate(new Date());
		}
		
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String beanName)
			throws BeansException {
		return obj;
	}
	

}
