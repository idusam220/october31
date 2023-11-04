public class TestOne
{
	static byte  variableOne;
	static short variableTwo;
	int          variableThree;
	long         variableFour;
	boolean      variableFive;
	final int    variableSix = 12;
	String       variableSeven;

	public void m1()
	{
	  System.out.println("Start of non-static m1 method");
	  int variableThree     = 12;
	  final int variableSix =34;
	  System.out.println("Value six of m1() method is :"+variableSix);
	  System.out.println("Value One is :"+variableOne);
	  System.out.println("value Two is :"+variableTwo);
	  System.out.println("Value Three is :"+variableThree);
	  System.out.println("End of non-static m1 method");
	}
	public void m2(int i)
	{
		System.out.println("Start of non-static m2 method");
		System.out.println("Variable one value is ="+variableOne);
		variableTwo =23;
		variableFour= 34l;
		System.out.println("Variable two value is ="+variableTwo);
		System.out.println("variable Three value is ="+variableThree);
		System.out.println("Variable four value is ="+variableFour);
		System.out.println("Variable Five value is ="+variableFive);
		System.out.println("variable six of m2(int i) method value is ="+variableSix);
		System.out.println("Variable Seven value is ="+variableSeven);
		System.out.println("End of non-static m2 method");


	}
	public void m2(double d)
	{
		System.out.println("Start of non-static m2 method");
		final int variableSix=35;
		System.out.println("Value of variableSix is "+variableSix);
		System.out.println("End of non-staticm3 method");
	}
	public void m3()
	{
		System.out.println("Start of non-static m3 method");
		System.out.println("End of non-static m3 method");
	}
	public static void main(String[]sam)
	{
		System.out.println("Start of Main Method");
		TestOne t6 = new TestOne();
		String userName = "Kyle";
		t6.m2(90);
		t6.m2(13.5);
		t6.m3();
		t6.m1();
		System.out.println("The user Name is "+userName);
		System.out.println("Variable One is ="+t6.variableOne);
		System.out.println("VariableTwo is ="+t6.variableTwo);
		System.out.println("Variable three is ="+t6.variableThree);
		System.out.println("Variable Four is ="+t6.variableFour);
		System.out.println("Variable Five is ="+t6.variableFive);

		System.out.println("End of Main Method");
	}
}