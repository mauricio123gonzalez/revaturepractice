package com.demo;

public interface HelloJava8Interface {
	public static void hiStatic() {
		System.out.println("static method within interface");
	}
	
	default void hiDefault() {
		System.out.println("default method");
		
	}
}