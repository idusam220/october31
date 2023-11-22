package rohit.rahul.exampletwo;
public class ParentExOne
{
	String name;
	String id;
	double income;

	public ParentExOne(String name,String id,double income)
	{
		System.out.println("Start of ParentExOne()constructor");
		this.name = name;
		this.id = id;
		this.income =income;
		System.out.println("End of ParentExOne()constructor");

	}

	void printInformation()
    {
	    System.out.println("Start of printInformation ()");
		System.out.println("Sorry no information is provided");
		System.out.println("End of printInformation()");
    }
	void m1(int valueOne)
	{
        System.out.println("Start of m1()method");
        System.out.println("The value of value One is : "+valueOne);
        System.out.println("End of m1()method");
	}
    public String toString()
	{
        return "Your name is = "+name + " ,and your id is : " +id + " ,and income is : " +income;
	}
}