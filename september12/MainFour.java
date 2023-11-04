public class MainFour
{
	public static void main(String[]args)
	{
	  System.out.println("Start of Main Method");
	  ParentExFour p4 = new ParentExFour();
	  p4.m12();
	  p4.m23();
	  System.out.println("====================");
	  ChildExFive c5 = new ChildExFive();
	  c5.m12();
	  c5.m21();
	  System.out.println("====================");
	  ChildExSix c6 = new ChildExSix();
	  c6.m12();
	  c6.m4();
	  System.out.println("====================");
	  ChildExSeven c7 = new ChildExSeven();
	  c7.m12();
	  c7.a1();
	  System.out.println("End of Main Method");


	}
}