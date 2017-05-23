package com.bercosoft.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bercosoft.model.Client;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml", App.class);

		 Client doctor = new Client();
		 doctor.call();

	}
}
