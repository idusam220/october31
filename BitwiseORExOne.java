public class BitwiseORExOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   int variableOne       = 34;
	   double variableTwo    = 45.6;
	   int variableThree     = 76;
	   double variableFour   = 23.3;

	   if(variableTwo > variableThree | variableThree > variableFour)
	   {
	   	 System.out.println("Start of if block");
	   	 System.out.println("End of if block");
	   }
	   else 
	   {
	   	 System.out.println("End of else block");
	   	 System.out.println("Hey");
	   }
	   System.out.println("End of Main Method");

	}
}