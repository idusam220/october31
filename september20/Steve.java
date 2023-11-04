public class Steve extends Person
{
	public Steve(int personId,String personName,double personAge,String country)
	{
		super(personId,personName,personAge,country);
	}
	@Override
	public void move()
	{
	   System.out.println("Start of move()non-static method of Steve class");
	   System.out.println("End of move()non-static method of Steve class");
    }
    @Override
    public void doWork()
	{
	   System.out.println("Start of doWork()non-static method of Steve class");
	   System.out.println("End of doWork()non-static method of Steve class");
    }
}