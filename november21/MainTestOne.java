package vincent.maintest.examplefive;
public class MainTestOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   Employee e1 = new Employee(101,"Patric",21);
	   Employee e2 = new Employee(201,"Harris",22);
	   FullTimeEmployee f1 = new FullTimeEmployee(201,"nathan",21,9000.00);
	   PartTimeEmployee p1 = new PartTimeEmployee(301,"Jack",31,9500.00);
	   e1.printInformation();
	   int emp1attendance = e1.calculateAttendance(31,4);
	   System.out.println("employee One attendance is : "+emp1attendance);
	   int emp2Attendance = e2.calculateAttendance(30,10);
	   System.out.println("Employee Two attendance is : "+emp2Attendance);
	   int fulltime1emp = f1.calculateAttendance(40,2);
	   System.out.println("FullTimeEmployee one attendance is : "+fulltime1emp);
	   int parttime1emp = p1.calculateAttendance(50,9);
	   System.out.println("Part Time Employee One attendance is : "+parttime1emp);
	   e1.printInformation();
	   e2.printInformation();
	   f1.printInformation();
	   p1.printInformation();
	   System.out.println(e1);
	   System.out.println(e2);
	   System.out.println(f1);
	   System.out.println(p1);
	   p1.calculateInsurance(450.00);
	   f1.calculateIncome(1000.00);
	   System.out.println("End of Main Method");
	}
}