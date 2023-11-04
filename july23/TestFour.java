public class TestFour
{
	final int i=12; //final non-static variable
	int a;//no-static variable
	public static void main(String[]args)
	{
		System.out.println("Start of Main method");
		TestFour t2 =new TestFour();
		final byte b;//final local variable
		short s ;//local variable
		System.out.println("The value a is :"+t2.a);
		System.out.println("End of Main Method");
	}
}