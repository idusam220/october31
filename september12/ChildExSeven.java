public class ChildExSeven extends ParentExFour
{
	public ChildExSeven()
	{
	   System.out.println("Start of ChildExSeven no parameter constructor");
	   System.out.println("End of ChildExSeven no parameter constructor");
	}
	public void a1()
	{
		System.out.println("Start of a1()non-static method of ChildExSeven");
		System.out.println("End of a1() non-static method of ChildExSeven");
	}
	@Override
	public void m12()
	{
		System.out.println("Start of m12() non-static method of ChildExSeven");
		System.out.println("End of m12() non-static method of ChildExSeven");
	
	}
}