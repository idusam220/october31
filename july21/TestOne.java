public class TestOne
{
	byte variableOne;
	short variableTwo;
	int variableThree;
	long variableFour;
	String name;
	double variableFive;

	public void m1()
	{
	  System.out.println("Start of non-static m1 method");
	  //String name;
	  System.out.println("The value of variable one is :"+variableOne);
	  System.out.println("The value of name is :"+name);
	  m2();
	  System.out.println("End of non-static m1 method");
	}
	public void m2()
	{
		System.out.println("Start of non-static m2-method");
		System.out.println("Variable One is ="+variableOne);
		System.out.println("Variable Two value is ="+variableTwo);
		System.out.println("Variable Three is ="+variableFour);
		System.out.println("Variable five is ="+variableFive);
		System.out.println("Your name is :"+name);
		System.out.println("End of non-static m2 method");
	}
	public void m3()
	{
		System.out.println("Start of non static m3 method");
		System.out.println("End of non-static m3 method");

	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		TestOne t2= new TestOne();
		t2.m3();
		t2.m2();
		t2.m1();
		System.out.println("Variable One is :"+t2.variableOne);
		System.out.println("Variable two is :"+t2.variableTwo);
		System.out.println("Variable Three is :"+t2.variableThree);
		t2.name ="James Gosling";
		System.out.println("Name is :"+t2.name);
		System.out.println("Variable Four is :"+t2.variableFour);
		System.out.println("Variable Five is :"+t2.variableFive);
		System.out.println("End of Main Method");
	}

}