public class Person
{
     		String name;
     static String location;
            int    age;
            double income;
    public void n1()
    {
    	System.out.println("Start of non-static n1 method");
    	System.out.println("Person name is : "+name);
    	System.out.println("Person age is : "+age);
  		System.out.println("Person Income is : "+income);
  		System.out.println("Person location is : "+location);
  		System.out.println("End of non-staticn1 method");
    }
    public static void n1(int i)
    {
    	System.out.println("Start of static n1 method");
    	Person p2 = new Person();
    	System.out.println("Person Name is : "+p2.name);
    	System.out.println("Person Location is : "+p2.location);
    	System.out.println("Person age is : "+p2.age);
    	System.out.println("Person income is : "+p2.income);
    	System.out.println("End of Static n1 Method");
    }
	public static void main(String[]args)
	{
	  System.out.println("Start of Main Method");
	  Person p1 = new Person();

	  /* the object or instance will get created in the memory.
	   Non-static variables will be stored within the object memory.
	   static variable will stored in a memory outside of the object 
	   static variable will be  accessed 
	   anywhere in the class it means inside non-static method and static method.*/
	  p1.n1();
	  p1.n1(10);
	  System.out.println("===========================");

	  System.out.println("Person Name is : "+p1.name);
	  System.out.println("Person location is :"+p1.location);
	  System.out.println("Person age is : "+p1.age);
	  System.out.println("Person income is : "+p1.income);
	  System.out.println("End of Main Method");
	}
}