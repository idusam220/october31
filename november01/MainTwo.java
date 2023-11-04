public class MainTwo
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    Employee e1 = new Patric("Patric",101,8700.00);
	    Employee e2 = new James("Jamess",201,8800.00);
	    System.out.println(e1 instanceof Employee);
	    System.out.println(e2 instanceof Employee);
	    System.out.println(e1 instanceof Object);
	    System.out.println(e2 instanceof Object);
	    System.out.println(e1);
	    System.out.println(e2);
	    System.out.println("End of Main Method");
	}
}