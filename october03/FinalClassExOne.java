public final class FinalClassExOne
{
	public short s           = 12;
	public final String name = "Kyle";
	public static float i    = 12.3F;

	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		FinalClassExOne f1 = new FinalClassExOne();
		System.out.println((short)f1.s);
		System.out.println(f1.name);
		System.out.println(f1.i);
			
	}
}