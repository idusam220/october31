abstract class Person
{
	public int personId;
	public String personName;
	public double personIncome;

	public Person(int personId,String personName,double personIncome)
	{
		System.out.println("Start of Person() parameterized contructor");
        this.personId     = personId;
        this.personName   = personName;
        this.personIncome = personIncome;
	}
	public void breathe()
	{
        System.out.println("Start of non-static breathe method");
        System.out.println("All the person breathe Oxygen");
        System.out.println("End of non-static breathe method");
	}
	public abstract void doWork();

	public static final void m1()
	{
		System.out.println("Start of static final m1()");
		System.out.println("End of static final m1()");
	}
	public String toString()
	{
		return "Person Id is : "+personId + ", Person Name is : "+personName + ", Person Income is : "+personIncome;
	}
}