public class MethodOverloadingExOne
{
	public void m1()
	{
		System.out.println(" m1 method with no parameters");
	}
     public void m1(int a, int b)
     {
     	System.out.println("m1 method with 2 parameters");
     }
     public void m1(int a)
     {
     	System.out.println("m1 method with 1 parameter");
     }
     public static void main(String[]args)
     {
     	System.out.println("Start of Main Method");
     	MethodOverloadingExOne me = new MethodOverloadingExOne();
     	me.m1(10);
     	me.m1(30,40);
     	me.m1();
     	System.out.println("End of Main Method");
     }
 }