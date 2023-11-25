package com.jack.kyle.exampleone;
public class ParentExOne
{
	protected int personId;
	protected String personName;
	protected double personIncome;

	public ParentExOne()
	{
		System.out.println("Start of ParentExOne()constructor");
		System.out.println("End of ParentExOne()constructor");

	}
	public ParentExOne(int personId,String personName,double personIncome)
	{
		super();
		System.out.println("Start of ParentExOne()constructor");
		System.out.println("End of ParentExOne()constructor");
		this.personId   = personId;
		this.personName = personName;
		this.personIncome = personIncome;
	}
	protected void a1Method()
	{
		System.out.println("Start of a1Method()");
		System.out.println("End of a1Method()");
	}
	protected void m2Method(int valueOne,double valueTwo)
	{
		System.out.println("Start of m2Method()");
		double result = valueOne+valueTwo;
		System.out.println("The result is = "+result);
	}
	protected int m4Method(int variableOne , int variableTwo)
	{
		System.out.println("Start of m4Method()");
		System.out.println("End of m4Method()");
		return 7;
	}
	protected String m1()
	{
		System.out.println("Start of m1() method");
		System.out.println("End of m1()method");
		return "james";
	}
	public String toString()
	{
		return "Person Id : "+personId+ " Person Name : "+personName+ " Person Income : "+personIncome;
	}
	

}