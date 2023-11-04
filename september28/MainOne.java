public class MainOne
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    TestOne t1 = new TestOne(101,"Kyle",56);
	    TestOne t2 = new TestOne(102,"James",61);
	    t1.m1();
	    double testValueOne = t2.m1('A');
	    boolean testValueTwo= TestOne.m2(true);
	    System.out.println("The value one is = "+testValueOne);
	    System.out.println("The value two is = "+testValueTwo);
	    System.out.println(t1);
	    System.out.println(t2);
	    System.out.println("=========================");
	    /*TestTwo t3 =new TestTwo()
	    System.out.println(t3);*/
	    System.out.println("End of Main Method");
	}
}