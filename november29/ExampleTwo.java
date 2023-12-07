package com.gaga.patric.exampleone;
import com.gaga.patric.exampleone.ExampleOne;
public class ExampleTwo
{
	public String userId;
	public ExampleTwo()
	{
		System.out.println("Start of ExampleTwo()");
		System.out.println("End of ExampleTwo()");
	}
	public ExampleTwo(String userId)
	{
		System.out.println("Start of ExampleTwo()");
		this.userId = userId;
		System.out.println("End of ExampleTwo()");
	}
	public void m9()
	{
		System.out.println("Start of m9()method");
		System.out.println("User Id : "+userId);
		System.out.println("End of m9()method");

	}
	public String toString()
	{
		return "User Id is : "+userId;
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		ExampleOne e1 = new ExampleOne();
		ExampleTwo e2 = new ExampleTwo();
		ExampleOne e3 = new ExampleOne("james95@gmail.com","James","New York");
		ExampleTwo e4 = new ExampleTwo("111");
		e1.m1();
		int result = e3.m3(100,200);

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println("End of Main Method");

	}
}