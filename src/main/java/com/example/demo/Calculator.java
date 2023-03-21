package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {

	public void someMethod(){
		System.out.println("It works!");
	}

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		calculator.someMethod();

	}

}
