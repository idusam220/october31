public class MainOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   ParentExOne p1    = new ParentExOne();
	   p1.m1(900);
	   double pvalueOne  = p1.m2('A');
	   boolean pvalueTwo = p1.m2(false);
	   Object pvalueThree= p1.m3();
	   Object pvalueFour = p1.m4('a');
	   System.out.println("Parent value one is "+pvalueOne);
       System.out.println("Parent value two is "+pvalueTwo);
       System.out.println("Parent value Three is "+pvalueThree);
       System.out.println("Parent value four is "+pvalueFour);
       System.out.println("======================================");
       ChildExTwo c1 = new ChildExTwo();
       c1.m1('r');
       double childValueOne = c1.m2('c');
       Object childValueTwo = c1.m3();
       System.out.println("Child value one is "+childValueOne);
       System.out.println("Child value two is "+childValueTwo);
       System.out.println("=====================================");
       ChildExTwo c2  = new ChildExTwo();
       boolean childTwoValueOne = c2.m2(true);
       Object childTwoValueTwo  = c2.m3();
       String childTwoValueThree= c2.m4('L');  
       System.out.println("Child two value one is "+childTwoValueOne);
       System.out.println("Child two value two is"+childTwoValueTwo);
       System.out.println("Child two value three is "+childTwoValueThree); 
       System.out.println("End of Main Method");  


	}
}