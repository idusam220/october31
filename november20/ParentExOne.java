package eric.bob.kyle;
public class ParentExOne
{
	int id;
	String firstName;
	String lastName;

	public ParentExOne()
	{
		System.out.println("End of ParentExOne() constructor");
		System.out.println("End of ParentExOne() constructor");

	}
	public ParentExOne(int id,String firstName,String lastName)
	{
		System.out.println("Start of ParentExOne()parameterized constructor");

		this.id = id;
		this.firstName = firstName;
		this.lastName  = lastName;
		System.out.println("End of ParentExOne() parameterized constructor");
	}
	void m2()
	{
		int valueOne = 12;
		boolean valueTwo = true;
		System.out.println("Start of m2()method");
		System.out.println("The value One is  = "+valueOne);
		System.out.println("The value two is = "+valueTwo);
		System.out.println("End of m2() method");

	}
	void m2(int valueOne,int valueTwo)
	{
		System.out.println("Start of m2() with 2 parameters");
		System.out.println("valueOne is :"+valueOne);
		System.out.println("valueTwo is :"+valueTwo);
		int result = valueOne+valueTwo;
		System.out.println("Result is = "+result);
		System.out.println("End of m2() with 2 parameters");
	}
	public String toString()
	{
		return "Id is : "+id+ " First name is : "+firstName+ " And your Last name is : "+lastName;
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method of class ParentExOne");
		ExampleOne e = new ExampleOne();
		e.m3();
		System.out.println("End of Main Method of class ParentExOne");
	}
}//close of ExampleOne