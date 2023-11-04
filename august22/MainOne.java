public class MainOne extends Object
{
    public static void main(String[]args)
    {
	    System.out.println("Start of Main Method");
	    ParentExOne p1 = new ParentExOne();
	    ChildExOne c1  = new ChildExOne();
	    p1.m1();
	    p1.m2('B');
	    p1.printName("James Gosling");
	    System.out.println("===========================");
	    c1.m1();
	    c1.m2(34);
	    c1.printName("Nathan");
	    System.out.println("End of Main Method");
	}

}