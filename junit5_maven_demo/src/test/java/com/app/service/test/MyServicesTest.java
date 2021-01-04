package com.app.service.test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.app.service.MyServices;




class MyServicesTest {

	
	private static MyServices services;
	
	@BeforeAll
	public static void setupMyServices() {
		services=new MyServices();
	}
	
	@Test
	public void testSayHelloByName() {
		String output="Hello Mauricio";
		assertEquals(output, services.sayHello("Mauricio"));
	}
	
	@Test
	public void testSayHelloForNull() {
		//String output="Null";
		assertNull(services.sayHello(null));
	}
	}


