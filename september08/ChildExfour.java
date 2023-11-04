public class ChildExfour extends ParentExFour
{
	@Override
	public void m6()
	{
		System.out.println("Start of non-static m6() of ChildExfour");
		System.out.println("End of non-static m6() of ChildExfour");
	}
	@Override
	public static void m7()
	{
		System.out.println("Start of non-static m7() of ChildExfour");
		System.out.println("End of non-static m7() of ChildExfour");

	}
}