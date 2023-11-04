public class MainOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   ParentExOne p1    = new ParentExOne();
	   Object pnameOne   = p1.n1(5);
	   System.out.println("Return name is " +pnameOne);
	   String pnameTwo   = p1.n2("Jackes");
	   System.out.println("Your name is " +pnameTwo);
       String pnameThree = p1.n3();
	   System.out.println("The return is"+pnameThree);
	   double pincome  = p1.n4(50000);
	   System.out.println("The income is"+pincome);
       int    pvalue  = p1.n5(190);
	   System.out.println("The value is "+pvalue);
	   System.out.println("======================");
	   ChildExOne  c1    = new ChildExOne();
	   String cnameOne   = c1.n1(6);
	   System.out.println("The return name : "+cnameOne);
	   String cnameTwo   = c1.n2("Betty");
	   System.out.println("Your name is : "+cnameTwo);
	   String cnameThree = c1.n3();
	   System.out.println("The return is "+cnameThree);
	   double cincomeOne = c1.n4(40000);
	   System.out.println("The income is "+cincomeOne);
	   int cvalueOne     = c1.n5(200);
	   System.out.println("The value returned is "+cvalueOne);
	   System.out.println("=======================");
	   ChildExTwo  c2  = new ChildExTwo();
	   String nameOne  = c2.n1(7);
	   System.out.println("Return name is : "+nameOne);
	   String nameTwo  = c2.n2("Happy");
	   System.out.println("Your name is : "+nameTwo);
	   String nameThree = c2.n3();
	   System.out.println("Returned name is "+nameThree);
	   double incomeTwo = c2.n4(40000);
	   System.out.println("your income is "+incomeTwo);
	   int valueTwo     = c2.n5(201);
	   System.out.println("returned value is "+valueTwo);
	   System.out.println("=====================");
	   ChildExThree c3 = new ChildExThree();
	   String nameOneA = c3.n1(8);
	   System.out.println("The ruturn name is : "+nameThree);
	   String nameTwoA = c3.n2("Angel");
	   System.out.println("Your name is : "+nameTwoA);
	   String nameThreeA = c3.n3();
	   System.out.println("returned"+nameThreeA);
	   double incomeFourA = c3.n4(40000);
	   System.out.println("Income returned is "+incomeFourA);
	   int valuenumber = c3.n5(202);
	   System.out.println("The returned value is "+valuenumber);
	   System.out.println("End of Main Method");
	}
}