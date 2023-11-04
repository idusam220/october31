public class FinalYearStudent extends Student
{
	public void study(int numberOfHours)
	{
	   System.out.println("Start of study method of class FinalYearStudent");
	   System.out.println("Final year are occupied in project so the number of hours to study is"+numberOfHours);
	   System.out.println("End of study method of class FinalYearStudent");

	}
	public void doPartTimeWork(double numberOfHours)
	{
		System.out.println("Start of do part time job method of class FinalYearStudent");
		System.out.println("Final year student works "+numberOfHours +"number of hours");
		System.out.println("End of do part time job methof of class FinalYearStudent");
	}
	public void submitFee(double fee)
	{
		System.out.println("Start of submitFee method of class FinalYearStudent");
		System.out.println("Toatal fee is "+fee + "for final year students");
		System.out.println("End of submitFee method of class FinalYearStudent");

	}
}