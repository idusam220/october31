public class MainOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   ChildExOne c1 = new ChildExOne();
	   c1.m6();
	   c1.m1();
	   short cvalue = c1.m1((short)10);
	   c1.b1(90);
	   System.out.println("Child value is "+cvalue);
	   System.out.println("==========================");
	   ParentExTwo p1 = new ParentExTwo();
	   p1.m1();
	   p1.b1('a');
	   System.out.println("End of Main Method");
	}
}