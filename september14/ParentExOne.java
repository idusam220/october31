public class ParentExOne
{
	public ParentExOne(int i)
	{
        System.out.println("Start of ParentExOne() constructor with int parameter");
        System.out.println("End of ParentExOne() constructor with int parameter");

	}
	public ParentExOne(boolean b)
	{
        System.out.println("Start of ParentExOne() constructor with boolean parameter");
        System.out.println("End of ParentExOne() constructor with boolean parameter");

	}
	public String sendHi()
	{
		return "Hi everyone";
	}
}