package com.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//API which takes care of bean creation
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		TextEditor obj = (TextEditor)context.getBean("editorbean");
		obj.spellCheck();
		
		context.close();
	
	}

}
