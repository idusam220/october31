public class BitwiseOperatorExOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   int x = 10, y = 15;
	    //if(11 < 10 & 16 > 15)
	    //if(false & true)
	    //if(false)

	   if(++x <10 & ++y > 15)
	   {
          
	   	  x++;
	   }
	   else 
	   {
	   	 //y =16
	   	 //y++ = 17
	   	  y++;
	   }
	   System.out.println("the value of x is = "+x);// x = 11
	   System.out.println("The value of y is = "+y);// y = 17
	   System.out.println("End of Main Method");
	}
}

/*
output
=======
Start of Main Method
the value of x is = 11
The value of y is = 17
End of Main Method
*/