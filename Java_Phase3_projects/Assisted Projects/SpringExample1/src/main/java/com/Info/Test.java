package com.Info;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
  
public class Test {  
public static void main(String[] args) {  
   
	//FirstWay-- BeanContext
	Resource resource=new ClassPathResource("application.xml");  
    @SuppressWarnings("deprecation")
	BeanFactory factory=new XmlBeanFactory(resource);  
	Student s=(Student)factory.getBean("stud");
	System.out.println("name="+s.getName());
    
    
    //SecondWay- ApplicationContext
    
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml"); 
    Student stud=(Student)context.getBean("stud");
	System.out.println("name="+stud.getName());
	
	 Student stud1=(Student)context.getBean("stud1");
		System.out.println("name="+stud1.getName());
}  
}  