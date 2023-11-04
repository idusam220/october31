public class ChildExThree extends ParentExThree
{
	private int e2()
	{
	    System.out.println("Start of e2 method of ChildExThree");
	    System.out.println("End of e2 method of ChildExThree class");
	    return 22;
	}
	public void e4(boolean k)
	{
	    System.out.println("Start of e4 method of ChildExThree");
	    System.out.println("The value of k "+k);
	    System.out.println("End of e4 method of class ChildExThree");
	}
	public void e3()
	{
	    System.out.println("Start of e3 method of ChildExThree");
	    System.out.println("End of e3 method of class ChildExThree");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of ChildExThree Main Method");
        ChildExThree c3 = new ChildExThree();		
		int value =c3.e2();
		System.out.println("The value is "+value);
		System.out.println("End of ChildExThree Main Method");
    }
}