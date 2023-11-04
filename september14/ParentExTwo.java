public class ParentExTwo
{
	public String name;
	public int age;
	public double income;

	public ParentExTwo(String name, int age , double income)
	{
		this.name   = name;
		this.age    = age;
		this.income = income;
		System.out.println("your name is : "+name + "Age : "+age + " Income :"+income);
	}
	public ParentExTwo(int i)
	{
		System.out.println("Start of ParentExTwo()constructor with int parameter");
		System.out.println("End of ParentExTwo()constructor with int parameter");
	}
	public String greet()
	{
		return "Have a good day";
	}

}