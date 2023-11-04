public class ChildExFour extends ChildExTwo
{
	public ChildExFour(float i)
	{
	    System.out.println("Start of constructor with float parameter");
	    System.out.println("The value of i "+i);
	    System.out.println("End of constructor with float parameter  ");
	}
	public boolean m2()
	{
		System.out.println("Start of m2() non-static method of ChildExFour");
		System.out.println("End ofm()non-static method of ChildExFour");
		return false;
	}
}