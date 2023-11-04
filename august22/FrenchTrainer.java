public class FrenchTrainer extends Trainer
{
   public double train(double numberOfHours)
	{
		System.out.println(" Start of train  method of class FrenchTrainer");
		System.out.println("The French Trainer is avaible every tuesday and Thusday");
		System.out.println("End of train  method of class FrenchTrainer");
		return numberOfHours;
	   
	}
	public void giveTasks()
	{
		System.out.println(" Start of give Tasks method of class FrenchTrainer");
		System.out.println("The trainer gives the Homeworks at the end of the session");
		System.out.println("End of give Tasks method of class FrenchTrainer");
	   
	}
	public void markAttendance()
	{
		System.out.println(" Start of mark Attendance method of class FrenchTrainerr");
		System.out.println("Mark the attendance list tuesdays and thursdays");
		System.out.println("End of mark Attendance method of class FrenchTrainer");
	   
	}
}
