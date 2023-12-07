package co.us.ibm.exampletwo;
public class ParentExTwo
{
	protected String firstName;
	protected String middleName;
	protected String lastName;

	public ParentExTwo()
	{
		System.out.println("Start of ParentExTwo()");
		System.out.println("Last name is : "+lastName);
		System.out.println("End of ParentExTwo()");
	}
	public ParentExTwo(String firstName,String middleName, String lastName)
	{
		System.out.println("Start of ParentExTwo ");
		this.firstName  = firstName;
		this.middleName = middleName;
		this.lastName   = lastName;
		System.out.println("End of ParentExTwo()");
	}
	protected void m1()
	{
		System.out.println("Start of m1()method");
		m5();
		int valueOne = 12;
		int valueTwo =13;
		int result   =valueOne+valueTwo;
		System.out.println("Result is : "+result);
		System.out.println("End of m1()method");
	}
	protected void m2()
	{
        System.out.println("Start of m2()method");
        System.out.println("End of m2()method");
	}
	protected void m6()
	{
		System.out.println("Start of m6()");
		System.out.println("End of m6()");
		m2();
	}
	protected void m5()
	{
		char valueOne ='a';
		char valueTwo = 'b';
		int valueThree= 12;
		int output = valueOne+ valueTwo+valueThree;
		System.out.println("Output is = "+output);
		System.out.println("End of m5()method");
	}
}