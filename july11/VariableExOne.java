public class VariableExOne
{
	String name;
	double income;
	public void m3()
	{
	System.out.println("Start of m3-method");
	name="Harris";
	String userName = "Kyle";
	System.out.println("Your name is :"+name);
	System.out.println("Your username is :"+userName);
	System.out.println("End of m3-method");

	}
	public void m4()
	{
		System.out.println("Start of m4-method");
		int i=12;
		int j=34;
		income= 4500.90;
		System.out.println("The value of i is :"+i);
		System.out.println("The value of j is :"+j);
		System.out.println("Income is :"+income);

	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		VariableExOne vo =new VariableExOne();
		vo.m3();
		vo.m4();
		System.out.println("End of Main Method");
	}
}