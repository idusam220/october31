public class Jack extends Person
{
	public double income;
	public Jack(int personId,String personName,double personAge,String country,double income)
	{
		super(personId,personName,personAge,country);
		this.income = income;
	}
	@Override
	public String toString()
	{
    	return "Your Id: "+personId+", Name : "+personName+", Age: "+personAge+", Country : "+country+", Income: "+income;
	}
	@Override
	public void move()
	{
	   System.out.println("Start of move()non-static method of Jack class");
	   System.out.println("End of move()non-static method of Jack class");
    }
    @Override
    public void doWork()
	{
	   System.out.println("Start of doWork()non-static method of Jack class");
	   System.out.println("End of doWork()non-static method of Jack class");
    }
    
}