package com.bercosoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Client
{
	@Autowired
	private Mongo groot;

	public String call()
	{
		return groot.getName();
	}
	
	public void setGroot(Mongo groot)
	{
		this.groot = groot;
	}
	
	public Mongo getGroot()
	{
		return groot;
	}
	

}
