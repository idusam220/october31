public class TestClassFive implements TestFour
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		TestFour t4 = new TestClassFive();
		//t4.valueOne = 34;
		System.out.println(valueOne);
		//t4.userName = "James";
		System.out.println(userName);
		System.out.println("End of Main Method");
	}
}