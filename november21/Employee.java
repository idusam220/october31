package org.patric.adam.demoone;
public class Employee
{
	int employeeId;
	String employeeName;
	int departmentId;
	public Employee(int employeeId,String employeeName,int departmentId)
	{
		System.out.println("Start of Employee() parameterized constructor");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.departmentId = departmentId;
		System.out.println("End of Employee() parameterized constructor");;

	}
	int calculateAttendance(int days,int numberOfLeaves)
	{
		System.out.println("Start of calculateAttendance () method");
		int attendance= days-numberOfLeaves;
		return attendance;
	}
	void printInformation()
	{
		System.out.println("Start of printInformation()method");
		System.out.println("Information will be displayed with toString()method");
		System.out.println("End of printInformation ()method");
	}
	public String toString()
	{
		return "Employee Id is : "+employeeId+ " Employee Name : "+employeeName+ " Department Id is : "+departmentId;
	}
}//End of class Employee