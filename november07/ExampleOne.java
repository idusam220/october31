package com.demo.exampleone;
public class ExampleOne
{
	public int sum(int valueOne, int valueTwo)
	{
		System.out.println("Start of non-static sum method");
		int result = valueOne + valueTwo;
		System.out.println("End of non-static sum method");
		return result;
	}
	public double sum(double valueOne, double valueTwo)
	{
		System.out.println("Start of non-static sum method with double parameter");
		double result = valueOne + valueTwo;
		System.out.println("End of non-static sum method with double parameter");
		return result;
	}
	
}