package com.assignment.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.assignment.bean.Animal;
import com.assignment.bean.Land;
import com.assignment.bean.Water;
import com.assignment.bean.Person;


@Configuration

public class AppConfig {
	@Bean("animal")
	public Animal getAnimal(){
		
		Animal a=new Water("Whale","Orca",true,"water");
		return a;
		
	}
	
	@Bean("person")
	public Person getPerson() {
		Person p = new Person("neelima",21);
		return p;
	}
	
	@Bean("petAnimal")
	public Land getPetAnimal(){
		
		Land a=new Land("Dog","Spanial",false,"kanel");
		return a;
		
	}
	


}
