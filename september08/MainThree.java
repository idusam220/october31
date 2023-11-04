public class MainThree
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   ParentExFour p4 = new ParentExFour();
	   p4.m6();
	   p4.m7();
	   System.out.println("=====================");
	   ChildExfour c4 = new ChildExFour();
	   c4.m6();
	   c4.m7();
	   System.out.println("End of Main Method");
	}
}