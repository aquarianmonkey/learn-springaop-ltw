package com.bercosoft.model;

import org.springframework.stereotype.Component;

@Component
public class Mongo
{
	private String name = "Groot";
	
	public String getName(){
		
		System.out.println("I am " + name);
		return name;
		
	}
}
