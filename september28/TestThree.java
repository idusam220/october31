public final class TestThree
{
	public int i =0;
	public final String name = "James";
	public static boolean value= true;

	public static void main(String[]args)
	{
        System.out.println("Start of Main Method");
        TestThree tt = new TestThree();
        System.out.println(tt.i);
        System.out.println(tt.name);
        System.out.println(value);
        System.out.println("End of Main Method");
	}
}