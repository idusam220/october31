public class ParentExTwo
{
	int id;
	String name;

	public void n1(int i)
	{
		System.out.println("Start of n1 method of class ParentExTwo");
		System.out.println("The value of i is "+i);
		System.out.println("End of n1 method of class ParentExTwo");
	}
	public int n2(int i)
	{
	    System.out.println("Start of n2 method of class ParentExTwo");
	    System.out.println("The value of i is "+i);
		System.out.println("End of n2 method of class ParentExTwo");
		return 18;
    }
    public double n3(double i)
    {
    	System.out.println("Start of n3 method of class ParentExTwo");
    	System.out.println("The value of i is : "+i);
		System.out.println("End of n3 method of class ParentExTwo");
		return i;

    }
    private void n4()
    {
        System.out.println("Start of n4 method of class ParentExTwo");
        System.out.println("End of n4 method of class ParentExTwo");
    }
    private void n5(boolean value)
    {
    	System.out.println("Start of n1 method of class ParentExTwo");
        System.out.println("our value is "+value);
		System.out.println("End of n1 method of class ParentExTwo");

    }
    public static void main(String[]args)
    {
        System.out.println("Start of ParentExTwo Main Method");
        ParentExTwo p2 = new ParentExTwo();
        p2.n4();
        p2.n5(false);
        System.out.println("End of ParentExTwo Main Method");
    }


}