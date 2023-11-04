public class VariablesExTwo
{// start of class VariablesExTwo
	static String universityName= "University of Columbus";
	final double universityFee =8500.00;
	String studentName;
	int studentId;
	public void submitAssignment()
	{
	System.out.println("Start of Submit Assignment");
	int numberOfAssignmentsSubmitted =70;// local variable
	System.out.println("Number of assignments submitted is " +numberOfAssignmentsSubmitted );



	}
	public void m1()
	{
		System.out.println("Start of m1 method");
		System.out.println("The University fee is :"+universityFee);
		final int i =45;//final local variable
		System.out.println("The value of i is :"+i);
		System.out.println("End of m1 method");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		VariablesExTwo vw =new VariablesExTwo();
		vw.submitAssignment();
		vw.m1();
		System.out.println("End of Main Method");
	}//close of Main method
}//close of class VariablesExTwo