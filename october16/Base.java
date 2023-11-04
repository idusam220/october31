public class Base
{
	static int i =10;
	static 
	{
		m1();
		System.out.println("Base Static block");
	}

	public static void main(String[]args)
	{
		m1();
		System.out.println("Base Main");
	}
	public static void m1()
	{
		System.out.println(j);
	}
	static int j = 20;

}//close of class Base