package com.sam.idu.exampleone;
public class ParentExOne
{
	int id;
	String name;
	boolean isMale;
	public ParentExOne()
	{
		super();
		System.out.println("Start of ParentExOne()constructor");
		System.out.println("End of ParentExOne()constructor");

	}

	public ParentExOne(int id,String name)
    {
    	System.out.println("Start of ParentExOne()constructor");
    	this.id = id;
    	this.name = name;
    	System.out.println("End of ParentExOne constructor");
    }
    public ParentExOne(String name,boolean isMale)
    {
    	System.out.println("Start of ParentExOne()constructor");
    	this.name = name;
    	this.isMale = isMale;
    	System.out.println("End of ParentExOne ()constructor");

    }
    public ParentExOne(int id,String name,boolean isMale)
    {
    	System.out.println("Start of ParentExOne()constructor");
    	this.id = id;
    	this.name = name;
    	this.isMale = isMale;
    	System.out.println("End of ParentExOne ()constructor");
    }
    void m1(int valueOne,int valueTwo)
    {
    	System.out.println("Start of m1()method");
    	System.out.println("Value One is = "+valueOne);
    	System.out.println("Value two is = "+valueTwo);
    	System.out.println("End of m1()method");

    }
    double m3(double valueOne,double valueTwo)
    {
    	System.out.println("Start of m3()method");
    	System.out.println("Value One is = "+valueOne);
    	System.out.println("Value Two is = "+valueTwo);
    	double output = valueOne - valueTwo;
    	return output;
    }
    public String toString()
    {
    	return "Id is : "+id+ " Name is : "+name+" isMale or not ? "+isMale;
    }
}