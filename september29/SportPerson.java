public abstract class SportPerson
{
	public final int sportpersonId = 101;

	public abstract void diet();

	public final void m1()
	{
		System.out.println("Start of m1 ()final method");
		System.out.println("End of m1()final method");
	}
	public static boolean m2(boolean value)
	{
		System.out.println("Start of m2(boolean) method");
		System.out.println("End of m2(boolean) method");
		return value;
	}
}