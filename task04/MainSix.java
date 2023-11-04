public class MainSix
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    ParentExFive p6 = new ParentExFive();
        p6.h1();
	    double pvalueOne  = p6.h2(12);
	    System.out.println("pvalueOne ="+pvalueOne);
	    boolean pvalueTwo = p6.h3(true);
	    System.out.println("pvalueTwo ="+pvalueTwo);

	    char pvalueThree  = p6.h4('c');
	    System.out.println("pvalueThree ="+pvalueThree);

	    int pvalueFour    = p6.h5(9);
	    System.out.println("pvalueFour ="+pvalueFour);

	    System.out.println("================");

	    ChildExSix   c2   = new ChildExSix();
	    c2.e3();
	    char charvalue = c2.e1('a');
	    System.out.println("charvalue ="+charvalue);

	    ParentExFive c6= new ChildExSix();
	    c6.h1();
	    double cvalueOne  = c6.h2(122);
	    System.out.println("cvalueOne ="+cvalueOne);

	    boolean cvalueTwo = c6.h3(true);
	    System.out.println("cvalueTwo ="+cvalueTwo);

	    char cvalueThree  = c6.h4('e');
	    System.out.println("cvalueThree ="+cvalueThree);

	    int cvalueFour    = c6.h5(90);
	    System.out.println("cvalueFour ="+cvalueFour);

	    System.out.println("================");

	    ChildExSeven c3  = new ChildExSeven();
	    boolean bvalue = c3.g1();
	    System.out.println("bvalue ="+bvalue);

	    ParentExFive c7= new ChildExSeven();
	    c7.h1();
	    double cvalueFive  = c7.h2(12);
	    System.out.println("cvalueFive ="+cvalueFive);

	    boolean cvalueSix = c7.h3(false);
	    System.out.println("cvalueSix ="+cvalueSix);

	    char cvalueSeven  = c7.h4('r');
	    System.out.println("cvalueSeven ="+cvalueSeven);

	    int cvalueEight    = c7.h5(10);
	    System.out.println("cvalueEight ="+cvalueEight);

	    System.out.println("==================");

	    ChildExEight c4  = new ChildExEight();
	    int ivalue = c4.g5(83);
	    System.out.println("ivalue ="+ivalue);

	    ParentExFive c8 = new ChildExEight();
	    c8.h1();
	    double cvalueNine  = c8.h2(12);
	    System.out.println("cvalueNine ="+cvalueNine);

	    boolean cvalueTen = c8.h3(true);
	    System.out.println("cvalueTen ="+cvalueTen);

	    char cvalueEleven  = c8.h4('f');
	    System.out.println("cvalueEleven ="+cvalueEleven);

	    int cvalueTwelve    = c8.h5(91);
	    System.out.println("cvalueTwelve ="+cvalueTwelve);

        System.out.println("End of Main Method");
	}
}