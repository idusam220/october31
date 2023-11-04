public class MainTwo
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    Employee  james     = new James();
	    james.setEmployeeId(301);
	    james.setEmployeeName("James");
	    james.setEmployeeIncome(8500.00);
	    int jamesEmployeeId        = james.getEmployeeId();
	    String jamesEmployeeName   = james.getEmployeeName();
	    double jamesEmployeeIncome = james.getEmployeeIncome();
	    System.out.println("Employee Id = "+jamesEmployeeId);
	    System.out.println("Employee Name is = "+jamesEmployeeName);
	    System.out.println("Employee Income is = "+jamesEmployeeIncome);
	    System.out.println("====================");
	    Employee patrick = new Patrick();
	    patrick.setEmployeeId(401);
	    patrick.setEmployeeName("Patrick");
	    patrick.setEmployeeIncome(8700.00);
	    int patrickEmployeeId        = patrick.getEmployeeId();
	    String patrickEmployeeName   = patrick.getEmployeeName();
	    double patrickEmployeeIncome = patrick.getEmployeeIncome();
	    System.out.println("Employee Id = "+patrickEmployeeId);
	    System.out.println("Employee Name is = "+patrickEmployeeName);
	    System.out.println("Employee Income is = "+patrickEmployeeIncome);
	    System.out.println("End of Main Method");
	}
}