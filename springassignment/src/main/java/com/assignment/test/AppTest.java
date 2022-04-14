package com.assignment.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.assignment.bean.Animal;
import com.assignment.config.AppConfig;
import com.assignment.bean.Person;

public class AppTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Animal a= (Animal) context.getBean("animal");
		System.out.println(a);
		System.out.println(a.getDetails());
		
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		System.out.println(p.getAnimalSetails());

	}


	

}
