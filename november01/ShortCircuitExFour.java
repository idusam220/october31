public class ShortCircuitExFour
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   int x = 23, y = 34;
	  // if(24 < 2 || 35 >= 34)
	   // if(false || true)
	   // if(true)
	   if(++x < 2 || ++y >= 34)// x = 24
	   {
	   	 // y++ = 36
	   	  ++y;
	   }
	   else 
	   {
	   	  x++;
	   }
	   System.out.println(x+".... "+y);// x = 24,y = 36
	   System.out.println("End of Main Method");
	}
}
/*
Output
======
Start of Main Method
24.... 36
End of Main Method
*/

