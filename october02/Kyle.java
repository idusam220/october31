public class Kyle extends Person
{
	public Kyle(int personId,String personName,double personIncome)
	{
		super(personId,personName,personIncome);
		System.out.println("End of Kyle()constructor");

	}
	@Override
	public void doWork()
	{
		System.out.println("Start of Kyle doWork()");
		System.out.println("Kyle works as a software Engineer");
	}
}