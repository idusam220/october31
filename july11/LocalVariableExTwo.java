public class LocalVariableExTwo
{
	String userName="James";
	double userIncome =4500.00;
	public void e1()
	{
		System.out.println("Start of e1-method");
		int i=10;
		int j =20;
		int result = i+j;
		System.out.println("The value of i is :"+i);
		System.out.println("The value of j is :"+j);
		System.out.println("The user income is :"+userIncome);
		System.out.println("The result is :"+result);
		System.out.println("End of e1 method");

	}
	//System.out.println("The value of local variable i is :"+i);
	//System.out.println("The valuen of local variable j is :"+j);
	public void d1()
	{
		System.out.println("Start of d1 method");
		System.out.println("The user name is :"+userName);
		System.out.println("The userIncome is :"+userIncome);
		//System.out.println("The value of i is :"+i);
		//System.out.println("The value of of j is:"+j);
		System.out.println("End of d1 method");

	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		LocalVariableExTwo ct =new LocalVariableExTwo();
		System.out.println("The userName is :"+ct.userName);
		System.out.println("The user income is :"+ct.userIncome);
		ct.e1();
		ct.d1();
		System.out.println("End of Main Method");
	}
}