public class EnglishTrainer extends Trainer
{
   public double train(double numberOfHours)
	{
		System.out.println(" Start of train  method of class EnglishTrainer");
		System.out.println("English trainer gives training on wednesday");
		System.out.println("End of train  method of class EnglishTrainer");
		return numberOfHours;
	   
	}
	public void giveTasks()
	{
		System.out.println(" Start of give Tasks method of class EnglishTrainer");
		System.out.println("English trainer gives Homework at the end of  session");
		System.out.println("End of give Tasks method of class EnglishTrainer");
	   
	}
	public void markAttendance()
	{
		System.out.println(" Start of mark Attendance method of class EnglishTrainer");
		System.out.println("Mark the attendance list every wednesday");
		System.out.println("End of mark Attendance method of class EnglishTrainer");
	   
	}
}
