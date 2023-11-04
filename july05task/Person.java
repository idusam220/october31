public class Person
{
	String name ;
	int age;
	static String companyName;
	public void doWork(){
		System.out.println("Doing the work properly");
 }
 public static void main(String[]args)
 {
 	System.out.println("Start of Main Method");
 	Person p1 =new Person();
 	p1.name = "Sam";
 	p1.age  =34;
 	p1.companyName= "JP Morgan";
 	System.out.println("Person 1 Name is:"+p1.name);
 	System.out.println("Person  1 age is :"+p1.age);
 	System.out.println("Person 1 companyName is :"+p1.companyName);
 	p1.doWork();
 	Person p2 =new Person();
 	p2.name  = "Venant";
 	p2.age   = 35;
 	p2.companyName ="JP Morgan";
 	System.out.println("Person 2 name is :"+p2.name);
 	System.out.println("Person 2 age is :"+p2.age);
 	System.out.println("Person 2 company name is :"+p2.companyName);
 	p2.doWork();
 	System.out.println("End of Main Method");

 }
}