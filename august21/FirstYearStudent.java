public class FirstYearStudent extends Student
{
	public void study(int numberOfHours)
	{
	   System.out.println("Start of Study method of class FirstYearStudent");
	   System.out.println("First year students study for "+numberOfHours +"in the University");
	   System.out.println("End of Study method of class FirstYearStudent");
	}
	public void doPartTimeWork(double numberOfHours)
	{
		System.out.println("Start of do part time job method of class FirstYearStudent");
		System.out.println("First year student can only work for "+numberOfHours +"these number of hours");
		System.out.println("End of do part time job method of class FirstYearStudent");
	}
	public void submitFee(double fee)
	{
		System.out.println("Start of submitFee method of class FirstYearStudent");
		System.out.println("The total fee is "+fee);
		System.out.println("End of submitFee method of class FirstYearStudent");
	}
}