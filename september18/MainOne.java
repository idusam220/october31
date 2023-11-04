public class MainOne
{
	public static void main(String[]args)
	{
		Employee e1 = new Employee(101,"james",65,9000.00);
		e1.m1('e');
		System.out.println(e1);
		System.out.println("============================");
		FullTimeEmployee fte1 = new FullTimeEmployee(201,"Robin",61,8700.00);
		fte1.m1(10);
		boolean fteValueOne = fte1.m2(true);
		System.out.println("The value is "+fteValueOne);
		System.out.println(fte1);
		System.out.println("============================");
		PartTimeEmployee pte1 = new PartTimeEmployee(301,"Kyle",60,8600.00);
		pte1.m1(20);
		System.out.println(pte1);
		System.out.println("End of Main Method");
	}
}