public class ChildExOne extends ParentExOne
{
	public String m1()
	{
	   System.out.println("Start of m1 method of class ChildExOne");
	   System.out.println("End  of m1 method of class ChildExOne");
	   return "James Gosling";
	}
	public String m2(String s2)
	{
		System.out.println("Start of m2 method of class ChildExOne");
		System.out.println(s2);
		System.out.println("End of m2 method of class ChildExOne");
		return s2;
	}
	public void m3(int a)
	{
		System.out.println("Start of m3 method of class childExOne");
		System.out.println(a);
		System.out.println("End of m3 method of class ChildExOne");
	}
}