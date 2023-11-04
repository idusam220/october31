public class PreDecrementExTwo
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		double g=56.5;
		--g;
		System.out.println(--g);
		System.out.println(--g);
		double r=g;
		--r;
		System.out.println(--r);
		System.out.println(--g);
		System.out.println(+r);
		System.out.println(+g);
		System.out.println("End of Main Method");

	}
}