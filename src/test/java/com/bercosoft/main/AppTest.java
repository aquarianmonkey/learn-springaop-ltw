package com.bercosoft.main;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bercosoft.model.Client;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"applicationContext-Test.xml"})
public class AppTest
{
	
	//Client uut = new Client();  // LTW fails DI here
	
	@Test
	public void testIfSpringBeanWasInjected()
	{
		//Used local variable as work around for failed DI on fields with @Configurable
		Client uut = new Client();
		
		assertNotNull("LTW failed to inject spring bean", uut.getGroot());
		
	}

}
