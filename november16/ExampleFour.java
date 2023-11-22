package vincent.virat.exampletwo;
import bob.eric.exampleone.ExampleOne;
public class ExampleFour extends ExampleOne
{
	private int departmentId;
	private double departmentFee;
	private String departmentName;

	private void  setDepartmentId(int departmentId)
	{
	this.departmentId = departmentId;
	}
	private int getDepartmentId()
	{
	   return departmentId;
	}
	private void  setDepartmentFee(double departmentFee)
	{
	this.departmentFee = departmentFee;
	}
	private double getDepartmentFee()
	{
	   return departmentFee;
	}
	private void  setDepartmentName(String departmentName)
	{
	this.departmentName = departmentName;
	}
	private String getDepartmentName()
	{
	   return departmentName;
	}
	public static void main(String[]args)
	{
		System.out.println("Start of ExampleFour Main Method");
		ExampleFour e4 = new ExampleFour();
		e4.setDepartmentId (301); 
		e4.setDepartmentName("IT"); 
		e4.setDepartmentFee(9000.00);
        int deptId = e4.getDepartmentId();
        String deptName = e4.getDepartmentName();
        double deptFee = e4.getDepartmentFee();
        System.out.println("Your Id is = " + e4.id);
        System.out.println("Your Name is = " + e4.name);
        System.out.println("Your Income is = "+ e4.income);
		System.out.println("End of ExampleFour Main Method");
	}
}