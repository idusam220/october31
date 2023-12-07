package com.gaga.patric.exampleone;
import com.gaga.patric.exampleone.ExampleOne;

public class ExampleFour extends ExampleOne
{
	public int age;

	public ExampleFour()
	{
		System.out.println("Start of ExampleFour()constructor");
		System.out.println("End of ExampleFour()constructor");

	}
	public ExampleFour(String emailId,String userName,String userLocation,int age)
	{
		super(emailId,userName,userLocation);
		System.out.println("Start of ExampleFour()constructor");
        this.age= age;
	}
	public static void m10()
	{
		System.out.println("Start of m10()method");
		System.out.println("End of m10()method");

	}
	public String toString()
	{
		String data = super.toString();
		return data + " "+" Age is : "+age;

	}
	public static void main(String[]args)
	{
		ExampleFour e1 = new ExampleFour();
		ExampleFour e2 = new ExampleFour();
		ExampleOne e3  = new ExampleOne();
		ExampleOne e4  = new ExampleFour("mark.waugh@gmail.com","Mark Waugh","Australia",45);
		int output = e3.m3(12,90);
		e2.m10();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println("end of Main Method");

	}
}