public class James extends Person
{
   	public James(int personId,String personName,double personIncome)
	{
		super(personId,personName,personIncome);
		System.out.println("End of James Constructor");

	}	
	@Override
	public void doWork()
	{
		System.out.println("Start of James doWork()method");
		System.out.println("James works as a Tech Lead");
		System.out.println("End of James doWork()method");
	}
}