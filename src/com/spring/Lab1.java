package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
	ctx.getBean("hello");
}	
}
