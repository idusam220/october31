public class MethodExOne
{
	public int m1(int a,int b)
	{
	int result = a+b;
	return result;
	}
	public static void main(String[]args)
	{
	System.out.println("Start of Main Method");
	MethodExOne me = new MethodExOne();
	int finalResult = me.m1(10,20);
	System.out.println("Ypur result is :"+finalResult);
	System.out.println("End of Main Method");
	}
}