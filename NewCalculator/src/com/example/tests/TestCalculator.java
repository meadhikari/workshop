package com.example.tests;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestCalculator {

	@Test
	public void testadd()
	{
		 
		assertEquals("10 + 5 must be 15 ",15 ,com.example.classes.Calculator.add(10, 5));
	}
	@Test
	public void testMultiply()
	{
		 
		assertEquals("2 x 3 must be 6 ",6 ,com.example.classes.Calculator.multiply(2, 3));;
	}
	@Test
	public void testdiv()
	{
		 
		assertEquals("2 / 1 must be 2 ",2 ,com.example.classes.Calculator.div(2, 1));
	}

}
