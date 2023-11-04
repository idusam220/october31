public class TestTwo
{
	static byte valueOne;
	int         valueTwo;
	static String valueThree;
	double     valueFour;

	public void n1()
	{
	  System.out.println("Start of non startic n1 method");
	  double valueFour =45;
	  System.out.println("The value Four is ="+valueFour);
	  System.out.println("The value Three is ="+valueThree);
	  n2();
	  System.out.println("End of non-static n1 method");

	}
	public void n2()
	{
		System.out.println("Start of non-static n2 method");
		System.out.println("Value One is :"+valueOne);
		System.out.println("Value Two is :"+valueTwo);
		System.out.println("Value Three is :"+valueThree);
		System.out.println("Value Four is :"+valueFour);
		System.out.println("End of non-static n2 method");
	}
	public void n3()
	{
		System.out.println("Start of nono-static n3 method");
		System.out.println("End of non-static n3 method");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		TestTwo t3 = new TestTwo();
		t3.n3();
		t3.n2();
		t3.n1();
		System.out.println("Value One is :"+t3.valueOne);
		System.out.println("Value Two is :"+t3.valueTwo);
		System.out.println("Value Three is :"+valueThree);
	}
}