package rohit.rahul.exampletwo;
public class ChildExOne extends ParentExOne
{
	public ChildExOne(String name, String id, double income)
	{
		super(name,id,income);

        System.out.println("Start of ChildExOne() Constructor");
        System.out.println ("End of ChildExOne() Constructor");
    }
}