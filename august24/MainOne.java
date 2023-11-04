public class MainOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   ParentOne p1  = new ParentOne();
	   p1.m1(10);
	   boolean pvalueOne   = p1.m1(false);
	   p1.m1(98);
	   int     pvalueThree = p1.m2('a');
	   System.out.println("Parent value one is "+pvalueOne);
	   // System.out.println("Parent value two is "+pvalueTwo);
	   System.out.println("=================================");

	   ChildOne  c1 = new ChildOne();
	   c1.m1(89);
	   boolean cvalueOne = c1.m1(true);
	   int cvalueTwo     = c1.m2('G');
	   c1.m1(76);
	   System.out.println("Child value one is"+cvalueOne);
	   System.out.println("Child value two is "+cvalueTwo);
	   // System.out.println("Child value Three is "+cvalueThree);
	   System.out.println("End of Main Method");
	}
}