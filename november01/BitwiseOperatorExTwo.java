public class BitwiseOperatorExTwo
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   int x = 12, y = 18;
	    //if(12 < 10 | 19 > 34)
	    // x++ ==>13
	   // if(false | false)
	   // if(false)

	   if(x++ < 10 | ++y > 34)
	   {
          
	   	  x++;
	   }
	   else 
	   {
	   	 // y =19
	   	 // y++=20
	   	  y++;
	   }
	   System.out.println("The value of x is = "+x);// x = 13
	   System.out.println("The value of y is = "+y);//y = 20
	   System.out.println("End of Main Method");
	}
}
/*
 Output
 =======
 Start of Main Method
The value of x is = 13
The value of y is = 20
End of Main Method
*/

