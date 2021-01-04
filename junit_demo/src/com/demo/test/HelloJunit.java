package com.demo.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class HelloJunit {
	

	@BeforeAll
	public static void helloBeforeAll() {
		System.out.println("before class");

	}
	
	@BeforeEach
	public void helloBeforeEach() {
		System.out.println("before each");
		
	}
	

	
	@Test
	public void testhello1() {
		System.out.println("test hello 1");
	}
	
	@Test
	public void testhello2() {
		System.out.println("test hello 2");
	}
	
	@AfterEach
	public void helloAfterEach() {
		System.out.println("after each");
	

	}
	
	
	@AfterAll
	public static void helloAfterClass() {
		System.out.println("after class");

	}
	

}
