public class ParentExThree
{
	private void m1(char a)
	{
	    System.out.println("Start of non-static m1() of ParentExThree");
	    System.out.println("The value of a is "+a);
	    System.out.println("End of non-static m1() of ParentExThree");

	}
	public boolean m1(boolean a)
	{
		System.out.println("Start of non-static m1() of ParentExThree with boolean parameter");
		System.out.println("The value of a is "+a);
	    System.out.println("End of non-static m1() of ParentExThree with boolean parameter");
	    return a;

	}
	public static void m2(double a)
    {
    	System.out.println("Start of static m2() of ParentExThree with double parameter");
    	System.out.println("The value of a is "+a);
    	System.out.println("End of static m2() of ParentExThree with double parameter");
    }
    public static void main(String[]args)
    {
    	System.out.println("Start of ParentExThree Main ");
    	ParentExThree p2 = new ParentExThree();
    	p2.m1('q');
    	System.out.println("End of ParentExThree Main ");
    }
}