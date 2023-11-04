public class MethodOverloadingExOne
{
	public void m2(int i)
	{
		System.out.println("m2 method with one parameter ");
	}
	public void m2(int i, int b)
	{
		System.out.println("m2 method with two parameters");
	}
	  //public int m2(int a)
	{
		return a;
    }
public static void main(String[]args)
{
	System.out.println("Start of Main Method");
	MethodOverloadingExOne me = new MethodOverloadingExOne();
	me.m2(10);
	me.m2(20,34);
	//int result = me.m2(23);
	//System.out.println("The result is "+result);
	System.out.println("End of Main Method");
}
}