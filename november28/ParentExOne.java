package com.google.exampleone;
public class ParentExOne
{
	protected int id;
	protected String name ;
	protected double income;

	public ParentExOne()
	{
		System.out.println("Start of ParentExOne()");
		System.out.println("Income is : "+income);
		System.out.println("Start of ParentExOne()");

	}
	public ParentExOne(int id,String name)
	{
		System.out.println("Start of ParentExOne param constructor");
		this.id   = id;
		this.name =name;
		System.out.println("End of ParentExOne() param constructor");

	}
	protected void m1()
	{
		System.out.println("Start of m1() method");
		m2();
		System.out.println("Id is : "+id);
		System.out.println("End of m1() method");
	}

	protected void m4()
	{
		System.out.println("Start of m4()method");
		System.out.println("Name is : "+name);
		System.out.println("End of m4()method");
	}
	protected void m2()
	{
		System.out.println("Start of m2()");
		System.out.println("End of m2()");
	}
}
