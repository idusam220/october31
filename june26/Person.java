public class Person
{
	//Properties:
	String name= "Sam";
	int age    = 33;
	double income=6000.00;

	// Behaviors one : It is a method in Java

	public void doWork(){
		System.out.println("Do his or her work properly");
	}
	// Behavior two :It is a method in java
	public void sleep(){
		System.out.println("Sleeping is good for help");
	}
    public static void main(String[]args)
    {
    	Person p1 = new Person();
    	System.out.println(p1.name);
    	System.out.println(p1.age);
    	System.out.println(p1.income);
    	p1.doWork();
    	p1.sleep();
    }


}