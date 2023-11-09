package org.student.exampleone;
import com.department.exampleone.Department;
import gov.address.exampleone.Address;
public class Student
{
	private String studentId;
	private String studentName;
	private double studentAge;
	public Department dept;

	public Address address;

	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public void setStudentId(String studentId)
	{
		this.studentId = studentId;
	}
	public String getStudentId()
	{
		return studentId;
	}
	public void setStudentAge(double studentAge)
	{
		this.studentAge = studentAge;
	}
	public double getStudentAge()
	{
		return studentAge;
	}
}