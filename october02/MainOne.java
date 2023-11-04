public class MainOne
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    Person Kyle = new Kyle(101,"Kyle",8500.00);
	    Person James = new James(201,"James",9000.00);
	    Kyle.breathe();
	    Kyle.doWork();
	    Kyle.m1();
	    System.out.println("Kyle's information: "+Kyle);
	    System.out.println("========================");
	    James.breathe();
	    James.doWork();
	    James.m1();
	    System.out.println("James' information: "+James);
	    System.out.println("End of Main Method");
	}
}