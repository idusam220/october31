package co.us.james.gosling.demoone;
public class ExampleOne
{
	protected int userId;
	protected String userName;
	protected double userBalance;
	protected int numberOfVehicles;

	public ExampleOne()
	{
		System.out.println("Start of ExampleOne() no-parameter constructor");
		System.out.println("SEnd of ExampleOne() no-parameter constructor");

	}
	public ExampleOne(int userId,String userName,double userBalance)
	{
		System.out.println("Start of ExampleOne()parameter constructor");
		this.userId = userId;
		this.userName = userName;
		this.userBalance= userBalance;
		System.out.println("End of ExampleOne() parameter constructor");

	}
	public ExampleOne(int userId,String userName,double userBalance,int numberOfVehicles)
	{
		System.out.println("Start of ExampleOne parameter constructor");
		this.userId     = userId;
		this.userName   = userName;
		this.userBalance= userBalance;
		this.numberOfVehicles = numberOfVehicles;
		System.out.println("End of ExampleOne parameter constructor");

	}
	protected String displayName(String firstName,String middleName,String lastLame)
	{
		System.out.println("Start of displayName method");
		System.out.println("End of  displayName method");
		String fullName = firstName+middleName+lastLame;
		return fullName;
	}
	protected double displayBalance()
	{

		System.out.println("Start of displayBalance noparameter method");
		System.out.println("End of displayBalance noparameter method");
		return userBalance;
	}
	protected void perfomCalculation(int valueOne, int valueTwo,int valueThree)
	{
		System.out.println("Start of perfomCalculation method");
		int result = valueOne+valueTwo/valueThree;
		System.out.println("The result is : "+result);
		System.out.println("End of perfomCalculation method");


	}
	public String toString()
	{
		return " User Id is : "+userId+ " User Name is : "+userName+" User Balance is : "+userBalance+" Number of Vehicles is : "+numberOfVehicles;
	}

}//End of class ExampleOne