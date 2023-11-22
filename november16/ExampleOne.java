package bob.eric.exampleone;
public class ExampleOne
{
	private int id;
	private String name;
    private double income;

    public ExampleOne()
    {
    	System.out.println("Start of ExampleOne");
    	System.out.println("End of ExampleOne");
    }
	private void calculateIncome()
	{
	double taxAmount = 1000.00;
	double rentAmount = 500.00;
	income = 7000.00;
	double incomeInHand =income-taxAmount-rentAmount;
	System.out.println("Your total income is = "+incomeInHand);
	}
	private void printDetails()
	{
	id = 101;
	name = "James";
	System.out.println("Your Id is = "+id);
		System.out.println("Your Name is = "+name);
	}
	public static void main(String[]args)
	{
	System.out.println("Start of Main Method");
	ExampleOne e1 = new ExampleOne();
	e1.printDetails();
	e1.calculateIncome();
	System.out.println("End of Main Method");

	}//End of main()method
}//End of class