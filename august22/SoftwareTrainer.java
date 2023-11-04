public class SoftwareTrainer extends Trainer
{
   public double train(double numberOfHours)
	{
		System.out.println(" Start of train  method of class SoftwareTrainer");
		System.out.println("SoftwareTrainer comes in every monday and Friday");
		System.out.println("End of train  method of class SoftwareTrainer");
		return numberOfHours;
	}
	public void giveTasks()
	{
		System.out.println(" Start of give Tasks method of class SoftwareTrainer");
		System.out.println("The trainer gives Tasks and interview questions at the end of the session");
		System.out.println("End of give Tasks method of class SoftwareTrainer");
	   
	}
	public void markAttendance()
	{
		System.out.println(" Start of mark Attendance method of class SoftwareTrainer");
		System.out.println("Mark the attendance list every mondays and Friday");
		System.out.println("End of mark Attendance method of class SoftwareTrainer");
	   
	}
	
}