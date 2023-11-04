public class DemoOne
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		String valueOne = "Bob";
		String valueTwo = new String("Nathan");
		StringBuffer valueThree = new StringBuffer("Nathan");
		StringBuilder valueFour = new StringBuilder("Bob");
		System.out.println(valueOne.equals(valueTwo));
		System.out.println(valueThree.equals(valueTwo));
		System.out.println(valueFour.equals(valueOne));
		System.out.println(valueTwo.equals(valueFour));
		System.out.println("End of Main Method");
	}
}