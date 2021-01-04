package com.demo.service.test;

import com.demo.service.MyServices;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class MyServicesTest {
	
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
