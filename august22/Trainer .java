public Trainer extends Object
{
	String name;
	double age;
	double income;

	public double train(double numberOfHours)
	{
		System.out.println(" Start of train method of class Trainer");
		System.out.println("The trainer is available during weekdays");
		System.out.println("End of train method of class Trainer");
		return numberOfHours;
	   
	}
	public void giveTasks()
	{
		System.out.println(" Start of give Tasks method of class Trainer");
		System.out.println("The trainer gives Tasks at the end of the session");
		System.out.println("End of give Tasks method of class Trainer");
	   
	}
	public void markAttendance()
	{
		System.out.println(" Start of markAttendance method of class Trainer");
		System.out.println("Mark the attendance list before each training");
		System.out.println("End of markAttendance method of class Trainer");
	   
	}

}