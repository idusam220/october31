public class TestClassOne implements TestOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   TestOne t2 = new TestClassOne();
	   System.out.println("The value of i is : "+t2.i);
	  // t2.i = 50;
	   System.out.println("The value of i is : "+t2.i);
	   System.out.println("Value of name is : "+t2.name);
	}
}