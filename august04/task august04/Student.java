public class Student
{
	String name;
	int age ;
	double schoolFee;
	public Student(String name, int age,double schoolFee)
	{
	  name=name;
	  age=age;
	  schoolFee=schoolFee;
	  System.out.println("Your name is : " +name + " age is : " +age +" School fees: " +schoolFee);

	}
	public Student(String name)
	{
		name = name;
		System.out.println("Student Name is :"+name);
	}
	public void m4()
	{
		System.out.println("Start of non static m4 method");
		System.out.println("End of non static m4 method");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		Student s1 = new Student("Eric",21,9000.00);
		Student s2 = new Student("David",22,9000.00);
		Student s3 = new Student("James Gosling");
		s1.m4();
		s2.m4();
		s3.m4();
		System.out.println("End of Main Method");
	}
}