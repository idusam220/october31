package sam.chris.adam.exampleone;
public class ParentExFour
{
	protected int age;
	protected String name;
	protected String companyName;
	public ParentExFour()
	{
		System.out.println("Start of ParentExFour()");
		System.out.println("End of ParentExFour()");

	}
	public ParentExFour(int age,String name,String companyName)
	{
		System.out.println("Start of ParentExFour()");
		this.age  = age;
		this.name = name;
		this.companyName= companyName;
		System.out.println("End of ParentExFour()");
	}
	public String toString()
	{
		return "Name is : "+name+" Age is : "+age+" Company Name is : "+companyName;
	}
	protected int addition(int valueOne, int valueTwo)
	{
		substraction(10,35);
		System.out.println("Start of addition method");
		System.out.println("Value One is :"+valueOne);
		System.out.println("Value Two is : "+valueTwo);
        int addResult = valueOne+valueTwo;
        return addResult;	
 	}
	protected void substraction(int valueOne,int valueTwo)
	{
		System.out.println("Start of substract method");
		System.out.println("ValueOne is : "+valueOne);
		System.out.println("Value Two is : "+valueTwo);
		int substractResult = valueOne-valueTwo;
		System.out.println("SubstractResult is = "+substractResult);
   }
}