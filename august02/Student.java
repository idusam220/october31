public class Student
{
	String name ;
	int age;

	public Student()
	{
	  name = "James Gosling";
	  age  =61;
	  System.out.println("Name is :"+name +" Age is :"+age);
	}
	public void m1()
	{
	  System.out.println("Start of m1-method");
	  int age=78;//local variable
	  System.out.println("End of Main Method");

	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		Student s1 = new Student();
		s1.m1();
		System.out.println("End of Main Method");
	}
}