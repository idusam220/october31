public class ParentExOne
{
	public  Object m1()
    {
       System.out.println("Start of m1 method of class ParentExOne");
       System.out.println("End of m1 method of class ParentExOne");
       return null;
    }
    public String m2(String s1)
    {
        System.out.println("Start of m2 method of class ParentExOne");
        System.out.println(s1);
        System.out.println("End of m2 method of class ParentExOne");
        return s1;

    }
    public void m3(int i)
    {
    	System.out.println("Start of m3 method of class ParentExOne");
    	System.out.println(i);
    	System.out.println("End of m3 method of class ParentExOne");

    }
    public int m3()
    {
    	System.out.println("Start of m3 method of class ParentExOne");
    	System.out.println("End of m3 method of class ParentExOne");
    	int numberOne = 34;
    	int numberTwo = 3;
    	int result    = numberOne+numberTwo;
    	return result;

    }
}