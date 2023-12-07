package com.gaga.patric.exampleone;
public class ExampleOne
{
	public String emailId;
	public String userName;
	public String userLocation;

	public ExampleOne()
	{
        System.out.println("Start of ExampleOne()constructor");
        System.out.println("End of ExampleOne()constructor");
	}
	public ExampleOne(String emailId,String userName,String userLocation)
	{
		System.out.println("Start of ExampleOne param constructor");
		this.emailId = emailId;
		this.userName = userName;
		this.userLocation = userLocation;
		System.out.println("End of ExampleOne() param constructor");
	}
	public static void m1()
	{
		System.out.println("Start of static m1()method");
		m2();
		System.out.println("End of static m1()method");

	}
	public int m3(int valueOne,int valueTwo)
	{
		System.out.println("Start of m3()method");
		int result = valueOne*valueTwo;
		System.out.println("End of m3()method");
		m2();
		return result;
	}
	public static void m2()
	{
		System.out.println("Start ofm2()method");
		System.out.println("End of m3()method");
	}
	public String toString()
	{
		return "Email Id : "+emailId+" UserName : "+userName+" User Location : "+userLocation;
	}
}