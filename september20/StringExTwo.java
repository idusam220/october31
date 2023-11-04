public class StringExTwo
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    String nameOne = new String("Mark");
	    String nameTwo = "Steve";
	    String nameThree = new String("Mark");
	    String nameFour  = "Steve";
	    System.out.println(nameOne==nameTwo);
	    System.out.println(nameOne.equals(nameTwo));
	    System.out.println(nameThree==nameFour);
	    System.out.println(nameThree.equals(nameFour));
	    System.out.println(nameThree==nameOne);
	    System.out.println(nameOne.equals(nameThree));
	    System.out.println(nameFour==nameTwo);
	    System.out.println(nameFour.equals(nameThree));
	}
}