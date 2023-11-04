public class PreIncrementExSeven
{
	public static void main(String[]args)
	{
	System.out.println("Start of Main Method");
	boolean b=true;
	System.out.println("The initial value of b is :" +b);
	++b; // We can not apply Pre-increment operator for boolean datatype.
	System.out.println("The final value of b is :" +b);
	System.out.println("End of Main Method");
	}
}