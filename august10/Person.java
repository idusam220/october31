//Defined or Declared a class
public class Person
{
	//Defined or declared the instance variables or non static variables

	String name;
	int age;
	double income;

	//Defined or Declared Parameterized Constructor

	public Person(String name, int age, double income)
	{
	   name   = name;
	   age    = age;
	   income = income;
	   System.out.println("parameterized constructor");
	}
	// Defined or Declared non parameterized constructor
	public Person()
	{
		System.out.println("Non parameterized constructor");
	}
	//Defined or Declared parameterized non static method
	public void m1(int i)
	{
		System.out.println("the value of i is :" +i);
	}
	//Defined or Declared non parameterized non static method
	public void m1()
	{
		System.out.println("non parameterized non static method");
	}
	//Defined or Declared parameterized static method
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		Person p1 = new Person();
		Person p2 = new Person("James Gosling",65,90000.00);
		Person p3 = new Person("Mark Andressen",63,90000.00);
		p1.m1(10);
		p2.m1(20);
		p3.m1();
		System.out.println("End of Main Method");

	}
}