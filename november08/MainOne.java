import java.util.Scanner;
public class MainOne
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		Scanner sc = null;
		String employeeId,employeeName = null;
		double employeeIncome          = 0.0;
		sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Please enter your Employee Id : ");
		employeeId = sc.nextLine();
		System.out.println("Please enter your Employee Name : ");
		employeeName = sc.nextLine();
		System.out.println("Please enter your Employee Income : ");
		employeeIncome = sc.nextDouble();
		emp.setEmployeeId(employeeId);
		emp.setEmployeeName(employeeName);
		emp.setEmployeeIncome(employeeIncome);
		System.out.println("Your Employee information are as follows : ");
		String eid = emp.getEmployeeId();
		String ename = emp.getEmployeeName();
		double eincome = emp.getEmployeeIncome();
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Income : "+eincome);
		System.out.println("End of Main Method");
	}//End of Main method
}//End of Class MainOne