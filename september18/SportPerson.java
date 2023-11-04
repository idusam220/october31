public class SportPerson
{
	public int sportsPersonId;
	public String sportsPersonName;
	public int sportsPersonAge;
	public String team;
	public double income;

	public SportPerson(int sportsPersonId,String sportsPersonName,int sportsPersonAge,String team,double income)
	{
		this.sportsPersonId = sportsPersonId;
		this.sportsPersonName = sportsPersonName;
		this.sportsPersonAge  = sportsPersonAge;
		this.team             = team;
		this.income           = income;
		System.out.println("Your Id is : "+sportsPersonId+" Name : "+sportsPersonName+" Age : "+sportsPersonAge+" Team : "+team+" Income : "+income); 
	}
	public double m3(double i)
	{
		System.out.println("Start of m3() non-static method with double parameter of SportPerson");
		System.out.println("The value of i is "+i);
		System.out.println("End of m3() non-static method with double parameter of SportPerson");
		return i;
	}
	public char m3(char c)
	{
		System.out.println("Start of m3() non-static method with char parameter of SportPerson");
		System.out.println("The value of c is "+c);
		System.out.println("End of m3() non-static method with char parameter of SportPerson");
		return c;
	}
}