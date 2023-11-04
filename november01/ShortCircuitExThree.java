public class ShortCircuitExThree
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   int a = 56, b = 78;
	   if(++a > 101 || b++ < 12)
	   {
	   	  a++;
	   }
	   else 
	   {
	   	  b++;
	   }
	   System.out.println("The Value of a is = "+a);
	   System.out.println("The Value of b is = "+b);
	   System.out.println("End of Main Method");
	}
}

