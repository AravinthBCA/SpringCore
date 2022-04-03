package com.aravinth.spring.SpringJavaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);
		Service obj = context.getBean(Service.class);
		obj.save();
		System.out.println(obj.hashCode());
		Service obj1 = context.getBean(Service.class);
		obj1.save();
		System.out.println(obj1.hashCode());
//		((AbstractApplicationContext) context).close();
	}
}
