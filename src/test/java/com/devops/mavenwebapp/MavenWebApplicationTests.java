package com.devops.mavenwebapp;

import org.junit.Assert;
import org.junit.Test;

public class MavenWebApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testMessage() {
		MessageController msg = new MessageController();
		System.out.println("Testing If message is 'Hello, World'");
		Assert.assertEquals(msg.sayHello(), "Hello, World");
	}
	
	@Test
	public void testNotMessage() {
		MessageController msg = new MessageController();
		System.out.println("Testing If message is not 'Hello'");
		Assert.assertNotEquals("Hello", msg.sayHello());
	}
	
	@Test
	public void testAddition() {
		CalculatorController cal = new CalculatorController();
		System.out.println("Testing addition");
		Assert.assertEquals(cal.addition(), 20);
	}
	
	@Test
	public void testNotAddition() {
		CalculatorController cal = new CalculatorController();
		System.out.println("Testing if addition is other than 20");
		Assert.assertFalse(cal.addition()!=20);
	}
	
	@Test
	public void testMultiplication() {
		CalculatorController cal = new CalculatorController();
		System.out.println("Testing multiplication");
		Assert.assertEquals(cal.multiplication(), 100);
	}
	
	@Test
	public void testNotMultiplication() {
		CalculatorController cal = new CalculatorController();
		System.out.println("Testing if multiplicationis other than 100");
		Assert.assertFalse(cal.multiplication()!=100);
	}
	
	@Test
	public void testDivision() {
		CalculatorController cal = new CalculatorController();
		System.out.println("Testing division");
		Assert.assertEquals(cal.division(), 10);
	}
	
	@Test
	public void testNotDivision() {
		CalculatorController cal = new CalculatorController();
		System.out.println("Testing if division is other than 10");
		Assert.assertFalse(cal.division()!=10);
	}
	
	@Test
	public void testRemainder() {
		CalculatorController cal = new CalculatorController();
		System.out.println("Testing remainder");
		Assert.assertEquals(cal.remainder(), 1);
	}
	
	@Test
	public void testNotRemainder() {
		CalculatorController cal = new CalculatorController();
		System.out.println("Testing if remainder is other than 1");
		Assert.assertFalse(cal.remainder()!=1);
	}
}
