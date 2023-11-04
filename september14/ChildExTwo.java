public class ChildExTwo extends ParentExTwo
{
	public ChildExTwo(String name,int age,double income)
	{
		super(name,age,income);

	}
	public void m1()
	{
		System.out.println("Start of m1() of ChildExTwo");
		System.out.println("End of m1() of ChildExTwo");
	}

}