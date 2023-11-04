public class Mark extends Person
{
	public int ssn;
	public Mark(int personId,String personName,double personAge,String country,int ssn)
	{
		super(personId,personName,personAge,country);
		this.ssn = ssn;
		// System.out.println("Your Social Security number is: "+ssn);
	}
	@Override
	public String toString()
	{
		return "Your Id: "+personId+", Name : "+personName+", Age: "+personAge+", Country : "+country+", ssn: "+ssn;
	}
	public void run()
	{
	   System.out.println("Start of run()non-static method of Mark class");
	   System.out.println("End of run()non-static method of Mark class");
    }
    @Override
    public void move()
	{
	   System.out.println("Start of move()non-static method of Mark class");
	   System.out.println("End of move()non-static method of Mark class");
    }
}