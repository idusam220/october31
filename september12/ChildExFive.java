public class ChildExFive extends ParentExFour
{
	public ChildExFive()
	{
	    System.out.println("Start of ChildExFive no parameter constructor");
	    System.out.println("End of ChildExFive no parameter constructor");
	}
	public void m21()
	{
		System.out.println("Start of m21()non static method of ChildExFive");
		System.out.println("End of m21()non static method of ChildExFive");
	}
	private void m32()
	{
		System.out.println("Start of m32()non-static method of ChildExFive");
		System.out.println("End of m32() non-static method of ChildExFive");
	}
	@Override
	public void m12()
	{
		System.out.println("Start of m12() non-static method of ChildExFive");
		System.out.println("End of m12() non-static method of ChildExFive");
	}
	public static void main(String[]args)
    {
	    System.out.println("Start of ChildExFive Main Method");
	    ChildExFive c1 = new ChildExFive();
	    c1.m32();
	    System.out.println("End of ChildExFive Main Method");
    }
}