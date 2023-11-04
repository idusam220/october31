public class MainOne
{
	public static void main(String[]args)
	{
	    System.out.println("Start of MainMethod");
	    ParentExOne p1 = new ParentExOne();
	    p1.m1();
	    int parentValue = p1.m2(23);
	    p1.m3();
	    System.out.println("The parentValue : "+parentValue);
	    System.out.println("================================");
	    ParentExOne p2 = new ChildExOne();
	    p2.m1();
	    int childValueOne = p2.m2('A');
	    //p2.m4();
	    System.out.println("Child value one :"+childValueOne);
	    System.out.println("=================================");
	    ParentExOne p3 = new ChildExTwo();
	    p3.m1();
	    int childValueTwo = p3.m2('a');
	    p3.m3();
	    //p3.m5();
	    System.out.println("End of Main Method");
	}

}