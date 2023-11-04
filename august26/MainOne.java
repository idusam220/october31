public class MainOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   ParentExOne p1   = new ParentExOne();
	   Object pvalueOne = p1.m1();
	   String pvalueTwo = p1.m2("Sam");
	   p1.m3('a');
	   int pvalueThree  = p1.m3();
	   System.out.println("Parent value one is "+pvalueOne);
	   System.out.println("Parent value two is "+pvalueTwo);
	   System.out.println("Parent value three is "+pvalueThree);
	   System.out.println("======================================");
	   ChildExOne c1  = new ChildExOne();
	   String cvalueOne = c1.m1();
	   String cvalueTwo = c1.m2("Nathan");
	   c1.m3('A');
	   System.out.println("child value one is "+cvalueOne);
	   System.out.println("child value two is "+cvalueTwo);
	   System.out.println("End of Main Method");
	}
}