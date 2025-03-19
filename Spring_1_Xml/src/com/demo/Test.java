package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
    	Resource resource = new ClassPathResource("SpringConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		// employee class
		Employee emp = (Employee) factory.getBean("rohit");
		System.out.println(emp);
		emp.display();
		
		// customer class
		Customer cs = (Customer) factory.getBean("mubeen");
		System.out.println(cs);
		cs.display();
		
		// Student class
		Student st = (Student) factory.getBean("safwan");
		System.out.println(st);
	}
}