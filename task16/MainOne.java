public class MainOne
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    ParentExThree p3  = new ParentExThree("Briella","Lana","Buntu",187.0,5000.0);
	    ParentExThree p4  = new ParentExThree("Harris",167.0,6000.0);
	    int pvalueOne     = p3.m1(16);
	    System.out.println("Parent value one is :"+pvalueOne);
	    double pvalueTwo  = p3.m1(54.5);
	    System.out.println("Parent value Two is : "+pvalueTwo);
	    char   pvalueThree= p3.m1('i');
	    System.out.println("Parent value Three is : "+pvalueThree);
	    System.out.println("===================================");
	    ChildExThree c3 = new ChildExThree("kate", "Lisa","Henriette",86.4,6000.0);
	    ChildExThree c4 = new ChildExThree("Joseph",175.1,5500.0);
	    int cvalueOne     = c3.m1(71);
	    System.out.println("Child value one is :"+cvalueOne);
	    double cvalueTwo  = c3.m1(77.5);
	    System.out.println("Child value Two is : "+cvalueTwo);
	    char   cvalueThree= c3.m1('i');
	    System.out.println("Child value Three is : "+cvalueThree);
	    boolean cvalueFour =c3.m2(true);
	    System.out.println("Child value four is : "+cvalueFour);
	    byte cvalueFive = c3.m2((byte)33);
	    System.out.println("Child value Three is : "+cvalueFive);
	    System.out.println("===================================");
	    ChildExFour c5 = new ChildExFour();
	    byte cvalueSix = c5.m2((byte)4);
	    System.out.println("Child value Six is : "+cvalueSix);
	    System.out.println("===================================");
	    ChildExFive c6 = new ChildExFive("Eric",166.0,3000.0);
        short cvalueSeven = c6.m6((short)44);
        System.out.println("Child value Seven is :"+cvalueSeven);
        System.out.println("End of Main Method");
	}
}