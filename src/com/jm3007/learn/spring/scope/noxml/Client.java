package com.jm3007.learn.spring.scope.noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		Car car1 = (Car) context.getBean("car");
		System.out.println(car1.hashCode());
		
		Car car2 = (Car) context.getBean("car");
		System.out.println(car2.hashCode());
		
//		Car car3 = new Car();
//		System.out.println(car3.hashCode());
		
		System.out.println("-------------------------");
		Bike bike1 = (Bike)context.getBean("bike");
		System.out.println(bike1.hashCode());

		Bike bike2 = (Bike)context.getBean("bike");
		System.out.println(bike2.hashCode());
		
		context.close();
	}

}
