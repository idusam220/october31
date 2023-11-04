public class MainTwo
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   ParentExSeven p7   = new ParentExSeven();
	   int pvalueOne      = p7.r1(88,89);
	   System.out.println("Parent Value one = "+pvalueOne);
	   double pvalueTwo   = p7.g1(33.5,23.5,11.0);
	   System.out.println("Parent Value Two is = "+pvalueTwo);
	   p7.j1(1,2,3);
	   System.out.println("================================");
	   ChildExEight c8    = new ChildExEight();
	   int cvalueOne      = c8.r1(34,44);
	   System.out.println("child value is : " +cvalueOne);
	   System.out.println("===========================");
	   ChildExNine c9     = new ChildExNine();
	   c9.z1();
	   int cvalueTwo      = c9.r1(92,12);
	   System.out.println("Child value Two = "+cvalueOne);
	   System.out.println("==============================");
	   ChildExTen c10     = new ChildExTen();
	   double cvalueThree = c10.l1(28.2,33.2);
	   System.out.println("Child value three is = "+cvalueThree);
	   int cvalueFour     = c10.r1(22,33);
	   System.out.println("Child value Four is = "+cvalueFour);
	   System.out.println("=============================");
	   ChildExEleven c11  = new ChildExEleven();
	   c11.q1();
	   int cvalueFive     = c11.r1(4,7);
	   System.out.println("Child value five is = "+cvalueFive);
	   System.out.println("=============================");
	   ChildExTwelve c12  = new ChildExTwelve();
	   c12.s1();
	   int cvalueSix      = c12.r1(2,4);
	   System.out.println("child value six is = "+cvalueSix);
	   System.out.println("==============================");
	   ChildExThirteen c13= new ChildExThirteen();
	   c13.o1();
	   int cvalueSeven    = c13.r1(8,10);
	   System.out.println("Child value seven is = "+cvalueSeven);

	   System.out.println("End of Main Method");

	}
}