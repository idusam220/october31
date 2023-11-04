public class Doctor
{
	String name;
	int age;
	double income;
	public void doTask()
	{

	  System.out.println("Do task properly");
	}
	public void n1()
	{
	  System.out.println("n1 non static method");
	}
	public static void main(String[]sam)
	{
		System.out.println("Start of Main Method");
		Doctor d1 = new Doctor();
		d1.doTask();
		d1.n1();
		System.out.println("End of Main Method");
	}
}