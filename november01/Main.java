public class Main 
{
	public static void main(String[]args)
	{
	     System.out.println("Start of Main Method");
	     Student s1 = new Student();
	     Address a1 = new Address();
	     s1.studentName  ="James Gosling";
	     s1.studentId    = 101;
	     s1.studentAge   = 65;

	     a1.houseNumber  = 32;
	     a1.streetNumber = 33445;
	     a1.cityName     ="LA";
	     a1.countryName  ="USA";

	     System.out.println("Student information =");
	     System.out.println(s1.studentName);
	     System.out.println(s1.studentAge);
	     System.out.println(s1.studentId);

	     System.out.println(a1.houseNumber);
	     System.out.println(a1.streetNumber);
	     System.out.println(a1.cityName);
	     System.out.println(a1.countryName);

	     double studentPercentage = s1.calculatePercentageOfSubjects();
	     System.out.println(studentPercentage);

	     System.out.println("End of Main Method");
	}
}