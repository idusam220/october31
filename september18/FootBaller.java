public class FootBaller extends SportPerson
{
	public FootBaller(int sportsPersonId,String sportsPersonName,int sportsPersonAge,String team,double income)
	{
		super(sportsPersonId,sportsPersonName, sportsPersonAge,team,income);
		// System.out.println("Your Id is : "+sportsPersonId+" Name : "+sportsPersonName+" Age : "+sportsPersonAge+" Team : "+team+" Income : "+income); 
	}
	public double m6(double d)
	{
		System.out.println("Start of m6() non-static method with double parameter of FootBaller");
		System.out.println("The value of d is "+d);
		System.out.println("End of m6() non-static method with double parameter of FootBaller");
		return d;
	}
}