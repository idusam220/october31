public class Person
{
	int personId;
	String personName;
	double personAge;
	String country;
	public Person(int personId,String personName,double personAge,String country)
	{
		this.personId = personId;
		this.personName = personName;
		this.personAge  = personAge;
		this.country    = country;
	}
	public void move()
	{
	   System.out.println("Start of move()non-static method of Person class");
	   System.out.println("End of move()non-static method of Person class");
    }
    public void doWork()
	{
	   System.out.println("Start of doWork()non-static method of Person class");
	   System.out.println("End of doWork()non-static method of Person class");
    }
    @Override
    public String toString()
    {
    	return "Your Id: "+personId+", Name : "+personName+", Age: "+personAge+", Country : "+country;
    }


}