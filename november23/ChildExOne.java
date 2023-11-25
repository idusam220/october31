package com.jack.kyle.exampleone;
public class ChildExOne
{
	protected String address;
	protected int departmentId;

	public ChildExOne()
	{
        System.out.println("Start of ChildExOne constructor");
	}
	public ChildExOne(String address,int departmentId)
	{
		System.out.println("Start of ChildExOne");
		this.address = address;
		this.departmentId = departmentId;
		System.out.println("End of ChildExOne() constructor");
	}
	protected String m1(String firstName,String lastName)
	{
        System.out.println("Start of m1()method");
        String fullName = firstName+lastName;
        return fullName;
	}
	protected void m5(int valueone,int valueTwo,int valueThree)
	{
		System.out.println("Start of m5()method");
        int output = valueone+valueTwo+valueThree;
	}
	public String toString()
	{
		return "Address is : "+address+" Department Id : "+departmentId;
	}
}//End of class ChildExOne