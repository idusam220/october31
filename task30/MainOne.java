public class MainOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   ParentExTwo p2 = new ParentExTwo();
	   p2.n1(32);
	   int pvalueOne = p2.n2(15);
	   System.out.println("Parent value one is "+pvalueOne);
	   double pvalueTwo = p2.n3(66);
	   System.out.println("Parent value Two is "+pvalueTwo);
	   System.out.println("=================================");
	   ChildExOne c1 = new ChildExOne();
	   c1.n1(70);
	   int cvalueOne = c1.n2(66);
	   System.out.println("Child valueOne  is "+cvalueOne);
	   double cvalueTwo = c1.n3(54);
	   System.out.println("Child valueTwo is "+pvalueTwo);
	   System.out.println("===============================");
	   ChildExTwo c2 = new ChildExTwo();
	   c2.n1(750);
	   int cvalueThree = c1.n2(6);
	   System.out.println("Child value Three is "+cvalueThree);
	   double cvalueFour = c1.n3(51);
	   System.out.println("Child value Four is "+cvalueFour);
	   System.out.println("===============================");
	   ChildExThree c3 = new ChildExThree();
	   c3.n1(50);
	   int cvalueFive = c3.n2(46);
	   System.out.println("Child value Five is "+cvalueFive);
	   double cvalueSix = c3.n3(511);
	   System.out.println("Child value Six is "+cvalueSix);
	   System.out.println("===============================");
	   ChildExFour c4= new ChildExFour();
	   c4.n1(530);
	   int cvalueSeven = c4.n2(63);
	   System.out.println("Child value Seven is "+cvalueSeven);
	   double cvalueEight = c4.n3(501);
	   System.out.println("Child value eight is "+cvalueEight);
	   c4.e1();
	   System.out.println("===============================");
	   ChildExFive c5 = new ChildExFive();
	   c5.n1(44);
	   int cvalueNine = c5.n2(69);
	   System.out.println("Child value nine is "+cvalueNine);
	   double cvalueTen = c5.n3(1);
	   System.out.println("Child value Ten is "+cvalueTen);
	   c5.e1();
	   System.out.println("End of MainOne class's Main Method");


	}
}