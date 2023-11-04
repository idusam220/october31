public class MainOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   ParentExOne p1 = new ParentExOne(101,"James",9000.00);
	   ParentExOne p2 = new ParentExOne(10);
	   char parentValueOne = p1.m1('A');
	   System.out.println("The value One is "+parentValueOne);
	   System.out.println("================================");
	   ChildExOne c1 = new ChildExOne(201,"Robin",9000.00,999999,76.5);
	   ChildExOne c2 = new ChildExOne('M');
	   char childValueOne = c1.m1('a');
	   System.out.println("Child value is : "+childValueOne);
	   System.out.println("End of Main Method");
	}
}