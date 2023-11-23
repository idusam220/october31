package robin.parttimeemployee.examplefour;
public class PartTimeEmployee extends Employee
{
	double income;
	public PartTimeEmployee(int employeeId,String employeeName,int departmentId,double income)
	{
		super(employeeId,employeeName,departmentId,income);
		this.income = income;
		System.out.println("Start of PartTimeEmployee()");
		System.out.println("End of PartTimeEmployee()");
	}
	void claculateInsurance(double insuranceAmount)
	{
		System.out.println("Start of claculateInsurance()method");
		double finalInsuranceAmaunt = income-insuranceAmount;
		System.out.println("Final Insurance amount is : "+finalInsuranceAmaunt);
	}
}//End of class PartTimeEmployee