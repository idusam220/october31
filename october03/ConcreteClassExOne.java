public class ConcreteClassExOne
{
	public int i =10;
	public static String name = "James";
	public final double income = 7000;

	public static void main(String[]args)
	{
		ConcreteClassExOne c1 = new ConcreteClassExOne();
		System.out.println(c1.i);
		System.out.println(c1.name);
		System.out.println(c1.income);
	}
}