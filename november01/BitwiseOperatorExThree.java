public class ShortSircuitExOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   int x = 10, y = 14;
	   if(++x >17 && ++y < 12)
	   {
	   	  x++;
	   }
	   else 
	   {
	   	  y++;
	   }
	   System.out.println("Value of x is = "+x);
	   System.out.println("Value of y is = "+y);
	   System.out.println("End of Main Method");
	}
}

