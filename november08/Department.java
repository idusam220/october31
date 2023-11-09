package com.department.exampleone;
public class Department
{
	private String departmentId;
	private String departmentName;
	private int numberOfHours;

	public void setDepartmentName(String departmentName)
	{
		this.departmentName = departmentName;
	}
	public String getDepartmentName()
	{
		return departmentName;
	}
	public void setDepartmentId(String departmentId)
	{
		this.departmentId = departmentId;
	}
	public String getDepartmentId()
	{
		return departmentId;
	}
	public void setNumberOfHours(int  numberOfHours)
	{
		this.numberOfHours = numberOfHours;
	}
	public int getNumberOfHours()
	{
		return numberOfHours;
	}
	
}