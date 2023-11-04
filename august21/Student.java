public class Student 
{
	String name;
	double height;
	double age;

	public void study(int numberOfHours)
	{
	    System.out.println("Start of study method of class Student");
	    System.out.println("Studied "+numberOfHours +"number of hours");
	    System.out.println("End of study method of class Student");
	}
	public void doPartTimeWork(double numberOfHours)
	{
        System.out.println("Start of do part time work method of class Student");
        System.out.println("Worked for "+numberOfHours +"These number of hours as part time job");
        System.out.println("End of do part time work method of class Student");
	}
	public void submitFee(double fee)
	{
		System.out.println("Start of submit fee method of class Student");
		System.out.println("The total "+fee);
		System.out.println("End of submit method of class Student");
	}
}