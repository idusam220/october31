public class BitwiseOperatorExTwo
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   int valueOne      = 12;
	   int valueTwo      = 14;
	   double valueThree = 34;
	   double valueFour  = 23;

	   if(valueOne < valueFour & valueThree < valueTwo)
	   {
	   	 System.out.println("Welcome to if block");
	   	 System.out.println("Hello");
	   }
	   else 
	   {
	   	 System.out.println("Hey from else block");
	   	 System.out.println("Bye from else block");
	   }
	   System.out.println("End of Main Method");

	}
}