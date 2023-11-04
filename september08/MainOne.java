public class MainOne
{
	public static void  main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   ParentExThree p1 = new ParentExThree();
	   boolean pvalue = p1.m1(true);
	   System.out.println("Parent value is "+pvalue);
	   p1.m2('A');
	   System.out.println("=============================");
	   ChildExOne c1 = new ChildExOne();
	   c1.m3(12);
	   c1.m2('B');
	   boolean cvalue =c1.m1(false);
	   System.out.println("Child value is "+cvalue);
	   System.out.println("End of Main Method");

	}
}