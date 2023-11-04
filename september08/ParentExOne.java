public class ParentExOne
{
	public void m3()
	{
	    System.out.println("Start of non-static m3() of ParentExOne with no parameter");
	    System.out.println("End of non-static m3() of ParentExOne with no parameter");
	}
	public int sum(int valueOne, int valueTwo)
	{
		System.out.println("Start of non-static sum() of ParentExOne with 2 int Parameters");
		int result =  valueOne + valueTwo;
		System.out.println("End of non-static sum() of ParentExOne with 2 int Parameters");
		return result;

	}
	public double divide(double valueOne , double valueTwo)
	{
        System.out.println("Start of non-static divide() of ParentExOne with 2 double parameter ");
        double result = valueOne/valueTwo;
        System.out.println("End of non-static divide() of ParentExOne with 2 double parameter ");
        return result;
	}
}