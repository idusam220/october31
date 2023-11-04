public class TestOne
{
	byte           valueOne;
	short          valueTwo=123;
	static int     valueThree;
	final long     valueFour=89l;
	static boolean valueFive;
	char           valueSix;
	String         valueSeven;
	final double   valueEight='d';



	public void m1()
	{
	   System.out.println("Start of non-static m1 method");
	   final String valueSeven="James Gosling";
	   final double valueEight=345.5D;

	   System.out.println("Value one is :"+valueOne);
	   System.out.println("Value Three is :"+valueThree);
	   System.out.println("Value Seven is :"+valueSeven);
	   System.out.println("Value Eight is :"+valueEight);
	   m2();
	   System.out.println("end of non-static m1 method");


	}
	public void m3()
	{
       System.out.println("Start of non-static m3 method");
       int valueThree=45;
       boolean valueFive=false;
       System.out.println("Value five is :"+valueFive);
       m2();
       System.out.println("End of non-static m3 method");

	}
	public void m4(int i)
	{
		System.out.println("Start of non-static m4 method");
		System.out.println("Value Four is :"+valueFour);
		System.out.println("End of non-static m4 method");
	}
	public void m2()
	{
       System.out.println("Start of non-static m2 method");
       System.out.println("Value one is :"+valueOne);
       System.out.println("value two is :"+valueTwo);
       System.out.println("Value Four is "+valueFour);
       System.out.println("Value five is :"+valueFive);
       System.out.println("Value Six is :"+valueSix);
       System.out.println("Value Seven is "+valueSeven);
       System.out.println("End of non-static m2 method");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		int i;
		TestOne t3 =new TestOne();
		t3.m4(45);
		t3.m1();
		t3.m3();
		double d =45;
		System.out.println("The value of d id :"+d);
		System.out.println("The value of Eight is :"+t3.valueEight);
		System.out.println("The value of five is :"+valueFive);
		System.out.println("End of Main Method");
	}
}