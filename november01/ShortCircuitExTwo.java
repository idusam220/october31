public class ShortCircuitExTwo
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   int x = 12, y = 34;
	   if(x++ > 10 || y++ < 5)
	   {
	   	  y++;
	   }
	   else 
	   {
	   	  x++;
	   }
	   System.out.println("Value of x is = "+x);
	   System.out.println("Value of y is = "+y);
	   System.out.println("End of Main Method");
	}
}

