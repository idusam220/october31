public class ParentExOne
{
	static int i = 18;
	String name = "James";

	static  
	{
		System.out.println("Start of First Static Block");
		System.out.println(i);
		System.out.println("End of First Static Block");
	}
	{
		System.out.println("Start of first Instance Block");
		System.out.println(name);
		System.out.println("End of first Instance Block");
	}
	static  
	{
		System.out.println("Start of Second Static block");
		m1();
		System.out.println("End of Second Static Block");

	}
	public static void m1()
	{
		System.out.println(v);
	}
	static int v =18;
	
	public ParentExOne()
	{
		System.out.println("ParentExOne constructor");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of main Method");


	}
}