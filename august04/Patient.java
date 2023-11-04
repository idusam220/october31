public class Patient
{
	String name;
	int age;
	public Patient(String name,int age)
	{
	  name= name;
	  age = age;
	  System.out.println("The patient name is :"+name + "Patient age is :"+age);

	}
	public void m1()
	{
		System.out.println("Non-static m1-method");
		m2();// m1() non-static method is calling m2()non-static method.
		System.out.println("End non-static m1 method");
	}
	public void m2()
	{
		System.out.println("Non-static m2 method");
	}
	public static void main(String[]args)
	{
	  System.out.println("Start of Main Method");
	  Patient p1 =new Patient("Job",35);// Here JVM first creates an object then calls the constructor to give the values to the object
	  p1.m1();// Static Main method is calling m1() non-static method with the help of p1 reference variable.

	 
	  System.out.println("End Of Main Method");

	}

}