public class LocalVariable
{
	static String companyName = "Bank of America";
	int numberOfEmployee= 34;
	public void p1()
	{
		System.out.println("Start of p1 method");
		int a =10;
		int b =34;
		System.out.println("The value of a is :"+a);
	
	    System.out.println("The value of b is :"+b);
	    System.out.println("The value of number of employe is :"+numberOfEmployee);
	    System.out.println("The company name is :"+companyName);
	    System.out.println("End of p1 method");
	}
	public void m4()
	{
		System.out.println("Start of m4 method");
		int a =90;
		System.out.println("End of m4 mehtod");

	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		LocalVariable lv =new LocalVariable();
		lv.p1();
		lv.m4();
		System.out.println("End of Main Method");
	}
}