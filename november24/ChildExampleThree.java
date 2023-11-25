package co.us.james.gosling.demoone;
public class ChildExampleThree extends ChildExampleTwo
{
	protected void add()
	{
        int valueOne= 10;
        int valueTwo = 20;
        int result   = valueOne+valueTwo;
        System.out.println("Result is = "+result);
	}
}