package co.us.james.gosling.demoone;
public class ChildExampleTwo extends ExampleOne
{
	protected String userAddress;

	public ChildExampleTwo(int userId,String userName,double userBalance,int numberOfVehicles,String userAddress)
	{
		super(userId,userName,userBalance,numberOfVehicles);
		this.userAddress = userAddress;
	}
	public ChildExampleTwo()
	{
		System.out.println("Hello");
	}
	protected void m1()
	{
		System.out.println("Start of m1() no parameter method");
		System.out.println("End of m1()no parameter method");
	}
	public String toString()
	{
		return "User Id is : "+userId+" User Name is : "+userName+" User Balance is : "+userBalance+" Number Of Vehicles is : "+numberOfVehicles+" Address : "+userAddress;
	}

}