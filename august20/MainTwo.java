public class MainTwo
{
	public static void main(String[]args)
	{
	  System.out.println("Start of Main Method");
	  Employee e1 = new Employee();
	  PartTimeEmployee pe = new PartTimeEmployee();
	  FullTimeEmployee fe = new FullTimeEmployee();
	  e1.dowork();
	  e1.submitTask();
	  e1.applyLeaves();
	  pe.name   = "Eric";
	  pe.age    = 32;
	  pe.income = 150.00;
	  fe.name   = "Mary";
	  fe.age    = 33;
	  fe.income = 3500.00;
	  System.out.println("Part time Employee name is : "+pe.name);
	  System.out.println("Part time Employee age is : "+pe.age);
	  System.out.println("Part time Employee income is : "+pe.income);
	  pe.doWork();
	  pe.submitTask();
	  pe.applyLeaves();
	  pe.getIncomeDaily();

	  System.out.println("Full time Employee name is : "+pe.name);
	  System.out.println("Full time Employee age is : "+pe.age);
	  System.out.println("Full time Employee income is : "+pe.income);
	  fe.doWork();
	  fe.submitTask();
	  fe.getIncomeMonthly();
	  System.out.println("End of Main Method");

	}
}