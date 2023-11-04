public class XORExTwo
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   int valueOne   = 23;
	   int valueTwo   = 45;
	   int valueThree = 21;
	   int valueFour  = 11;
	   int valueFive  = 89;
	   int valueSix   = 34;
	   //if(true ^ true ^ false ^ false)
	   //if(false ^ false)
	   //if(false)
	   if(valueSix > valueFour ^ valueOne < valueTwo ^ valueFive == valueFour ^ valueThree > valueOne)
	   {
	   	 System.out.println("Start of if block");
	   	 char a ='A';
	   	 System.out.println("The value of a is : "+a);
	   }
	   else 
	   {
	   	System.out.println("Start of else block");
	   	int i = 45;
	   	System.out.println(i);
	   }
	   System.out.println("End of Main Method");
	}
}

/* Output
=========
Start of Main Method
Start of else block
45
End of Main Method
*/