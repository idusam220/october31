package org.david.gaga.exampletwo;
public class ChildExTwo
{
	int id;
	String name;
	double income;

	public ChildExTwo()
	{
		super();
		System.out.println("Start of ChildExTwo()constructor");
		System.out.println("End of ChildExTwo()constructor");

	}

	public ChildExTwo(int id,String name,double income)
	{
		super();
		System.out.println("Start of ParentExTwo()constructor");
		this.id = id;
		this.name = name;
		this.income = income;
		System.out.println("End of ParentExTwo()constructor");

	}
	void m4()
	{
		System.out.println("Start of m4()method");
		System.out.println("End of m4 method");

	}
	public String toString()
	{
		return " Id is : "+id+" Name is : "+name+" Income is : "+income;
	}
}
