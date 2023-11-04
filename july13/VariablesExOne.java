public class VariablesExOne
{ //start of class VariablesExOne
	// static variabl
	static String companyName ="Bank of America"; 
	//  Non static variable
	int numberOfEmployees =2500;
	public void m1()
	{ //start of m1() method
		System.out.println("Start of m1 method");
		final String userName = "James Gosling";
		int age =61;
		System.out.println("The value of the user name is ;"+userName);
		System.out.println("The value of age is :"+age);
		System.out.println("The value of company name is :"+companyName);

	} //close of m1() method
 	public void m2(int a)
	{ //start of m2() method
		System.out.println("Start of m2 method");
		int valueOfA =a;
		System.out.println("The value is :"+valueOfA);
		System.out.println("End of Main Method");

	} //close of m2() method
	public static void main(String[]args)
	{ //start of main() method
		System.out.println("Start of Main Method");
		VariablesExOne ve =new VariablesExOne();

        System.out.println("Number of Employees are :"+ve.numberOfEmployees);
		System.out.println("The company name is :"+companyName);
		System.out.println("End of Main Method");
	} //close of main() method
	
} //close of class VariablesExOne