public class NestingForLoopExOne
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Welcome to Outer loop");
			for(int j = 0; j < 2; j++)
			{
				System.out.println("Hi from Inner Lopp");
			}
		}
		System.out.println("End of Main Method");
		
	}

}