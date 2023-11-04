public class MainOne
{
	public static void main(String[]args)
	{
	  System.out.println("Start of MainOne Main Method");
	  ParentExOne p1 = new ParentExOne();
	  p1.m1('a');
	  System.out.println("=======================");
	  ChildExOne c1 = new ChildExOne();
	  c1.m2(true);
	  c1.m5();
	  System.out.println("=========================");
	  ChildExTwo c2 = new ChildExTwo();
	  c2.m1('A');
	  System.out.println("End of MainOne Main Method");

	}
}