public class MainOne
{
	public static void main(String[]args)
	{
	    System.out.println("Start of MainOne Main Method");
	    ParentExThree p3 = new ParentExThree();
	    p3.e4(false);
	    p3.e3();
	   
	    System.out.println("==============================");
	    ChildExThree c3  = new ChildExThree();
	    c3.e4(true);
	    c3.e3();
	    System.out.println("===============================");
	    ChildExFour  c4  = new ChildExFour();
	    c4.e4(true);
	    c4.e3();
	    System.out.println("===============================");
        ChildExFive  c5  = new ChildExFive();
	    c5.e4(false);
	    c5.e3();
	    System.out.println("===============================");
	    SmallChildExOne s1 = new SmallChildExOne();
	    s1.e4(false);
	    s1.e3();
	    System.out.println("End of MainOne Main Method");
	}
}