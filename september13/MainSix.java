public class MainSix
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    ParentExOne p1 = new ParentExOne(15);
	    ParentExOne p2 = new ParentExOne(12f);
	    ParentExOne p3 = new ParentExOne('e');
	    ParentExOne p4 = new ParentExOne(7.8);
	    ParentExOne p5 = new ParentExOne(true);
	    int presultOne = p1.add(12,13);
	    System.out.println("parent result one  = "+presultOne);
	    double presultTwo = p1.add(33.2,34.4);
	    System.out.println("parent result two= "+presultTwo);
	    boolean pvalueOne = p1.m1(false);
	    System.out.println("The value is "+pvalueOne);
	    System.out.println("===============================");
	    ChildExOne c1 = new ChildExOne(15);
	    int cresultOne = c1.add(2,13);
	    System.out.println("parent result one  = "+cresultOne);
	    double cresultTwo = c1.add(14.6,3.4);
	    System.out.println("parent result two= "+cresultTwo);
	    boolean cvalueOne = c1.m1(true);
	    System.out.println("The value is "+cvalueOne);
	    System.out.println("===============================");
	    ChildExTwo c10 = new ChildExTwo();
	    int childResultOne = c10.add(62,73);
	    System.out.println("parent result one  = "+childResultOne);
	    double childResultTwo = c10.add(3.2,4.6);
	    System.out.println("parent result two= "+childResultTwo);
	    boolean childValueOne = c10.m1(false);
	    System.out.println("The value is "+childValueOne);
	    c10.p1();
	    c10.p2(20);
	    System.out.println("===============================");
	    ChildExThree c11 = new ChildExThree(6);
	    int resultOne = c11.add(12,13);
	    System.out.println("parent result one  = "+resultOne);
	    double resultTwo = c11.add(33.2,34.4);
	    System.out.println("parent result two= "+resultTwo);
	    boolean valueOne = c11.m1(false);
	    System.out.println("The value is "+valueOne);
	    double mresult = c11.multiply(8.5,5.5,7.0);
	    System.out.println("multiply result = "+mresult);
	    ChildExThree c12 = new ChildExThree(9,54);
	    System.out.println("===============================");
	    ChildExFour c13 = new ChildExFour(12f);
	    boolean valueFour = c13.m2();
	    System.out.println("Child four value = "+valueFour);
	    int cresultseven = c13.add(12,13);
	    System.out.println("parent result one  = "+cresultseven);
	    double cresultEight = c13.add(13.2,5.4);
	    System.out.println("parent result two= "+cresultEight);
	    boolean valueFive = c13.m1(false);
	    System.out.println("The value is "+valueFive);
	    System.out.println("End of Main Method");

	}
}