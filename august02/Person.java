public class Person
{
	String name;
	int age;
	double income;
	public void doWork()
	{
		System.out.println("Doing work properly");
	}
	public static void main(String[]args)
	{
	  System.out.println("Start of Main Method");
	  Person p1 = new Person();
	  Person p2 = new Person();
	  Person p3 = new Person();
	  p1.name= "Mark";
	  p1.age=23;
	  p1.income=4500.00;
	  p2.name="Steve";
	  p2.age=30;
	  p2.income=8000.00;
	  p3.name="Eric";
	  p3.age= 29;
	  p3.income=7000.00;
	  System.out.println("Person one name is:" +p1.name);
	  System.out.println("Person One Age is :"+p1.age);
	  System.out.println("Person One income is :"+p1.income);
	  System.out.println("Person two name is :"+p2.name);
	  System.out.println(" Person two age is:"+p2.age);
	  System.out.println("Persone Two income is :"+p2.income);
	  System.out.println("Person Three name is :"+p3.name);
	  System.out.println("Person Three age is :"+p3.age);
	  System.out.println("Person three income is :"+p3.income); 

	  System.out.println("End of Main Method");
	}
}