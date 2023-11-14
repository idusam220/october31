package com.sam.demoone;
public class Person
{
	private String personId;
	private String personName;
	private int personAge;
	private double personIncome;

	public Person()
	{
        System.out.println("start of Person constructor");
        System.out.println("End of Person constructor");
	}
	public void setPersonId(String personId)
	{
		this.personId = personId;
	}
	public String getPersonId()
	{
		return personId;
	}
	public void setPersonName(String personName)
	{
		this.personName = personName;
	}
	public String getPersonName()
	{
		return personName;
	}
	public void setPersonAge(int personAge)
	{
		this.personAge = personAge;
	}
	public int getPersonAge()
	{
		return personAge;
	}
	public void setPersonIncome(double personIncome)
	{
		this.personIncome = personIncome;
	}
	public double getPersonIncome()
	{
		return personIncome;
	}

}