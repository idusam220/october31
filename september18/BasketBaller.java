public class BasketBaller extends SportPerson
{
	public BasketBaller(int sportsPersonId,String sportsPersonName,int sportsPersonAge,String team,double income)
	{
		super(sportsPersonId,sportsPersonName, sportsPersonAge,team,income);
		// System.out.println("Your Id is : "+sportsPersonId+" Name : "+sportsPersonName+" Age : "+sportsPersonAge+" Team : "+team+" Income : "+income); 
	}
	public String m5(String s)
	{
		System.out.println("Start of m5() non-static method with String parameter of BasketBaller");
		System.out.println("The value of s is "+s);
		System.out.println("End of m5() non-static method with String parameter of BasketBaller");
		return s ;
	}
}