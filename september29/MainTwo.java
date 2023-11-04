public class MainTwo
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    SportPerson sp1 = new BasketBaller();
	    sp1.diet();
	    boolean valueOne = sp1.m2(false);
	    System.out.println("Value One is  "+valueOne);
	    System.out.println("==========================");
	    SportPerson sp2 = new FootBaller();
	    sp2.diet();
	    boolean valueTwo = sp2.m2(true);
	    System.out.println("Value two is "+valueTwo);
	    System.out.println("End of Main Method ");
	}
}