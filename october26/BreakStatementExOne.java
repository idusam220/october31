public class BreakStatementExOne
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		for(int i = 0; i<5;i++)
		{
			System.out.println("Start of For Loop");
			if(i=4)
			break;
			System.out.println("End of For Loop");
		}
		System.out.println("End of Main Method");

	}
}