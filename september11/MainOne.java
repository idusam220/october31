public class MainOne
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    ParentExOne p1 = new ParentExOne();
	    p1.m1(12);
	    double pvalue = p1.m2(14.5);
	    System.out.println("The Parent value is "+pvalue);
	    System.out.println("==============================");
	    ChildExOne c1 = new ChildExOne();
	    c1.m5();
	    c1.m1(13);
	    c1.m9();
	    System.out.println("End of Main Method");
	}
}