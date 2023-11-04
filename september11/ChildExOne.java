public class ChildExOne extends ParentExOne
{
	private void m5()
	{
        System.out.println("Start of m5() non-static method of ChildExOne");
        System.out.println("end of m5() non-static method of ChildExOne");
	}
	@Override
	public void m1(int a)
	{
		System.out.println("Start of m1() non-static method of ChildExOne");
		System.out.println("The value of a is "+a);
		System.out.println("End of m1() non-static method of ChildExOne");
	}
	@Override
	public final void m9()
	{
		System.out.println("Start of m9()final method of ChildExOne");
		System.out.println("End of m9() final method of ChildExOne");
	}
}