public class Boxer extends SportPerson
{
	public Boxer(int sportsPersonId,String sportsPersonName,int sportsPersonAge,String team,double income)
	{
		super(sportsPersonId,sportsPersonName, sportsPersonAge,team,income);
		// System.out.println("Your Id is : "+sportsPersonId+" Name : "+sportsPersonName+" Age : "+sportsPersonAge+" Team : "+team+" Income : "+income); 
	}
	public byte m4(byte b)
	{
		System.out.println("Start of m4() non-static method with byte parameter of Boxer");
		System.out.println("The value of b is "+b);
		System.out.println("End of m4() non-static method with byte parameter of Boxer");
		return b;
	}

}