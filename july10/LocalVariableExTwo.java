public class LocalVariableExTwo
{
	public void m1()
	{
		System.out.println("Start of fm1-method");
		String name = "Sam";
		int age = 33;

		System.out.println("Your name is :"+name);
		System.out.println("Your age is "+age);
		System.out.println("End of m1-method");

	}
	public void m2()
	{
		System.out.println("Start of m2-method");
		String name ="Sam";
		System.out.println("Your name is :"+name);
		System.out.println("End of m2-method");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		LocalVariableExTwo lv =new LocalVariableExTwo();
		lv.m1();
		lv.m2();
		System.out.println("End of Main Method");
	}
}