public class StringBuilderExOne
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		StringBuilder sbu1 = new StringBuilder("virat");
		StringBuilder sbu2 = new StringBuilder("virat");
		System.out.println(sbu1==sbu2);
		System.out.println(sbu1.equals(sbu2));
		System.out.println(sbu2.equals(sbu1));
		System.out.println("End of Main Method");
	}
}