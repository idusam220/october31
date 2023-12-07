package mark.waugh.exampletwo;
import sam.chris.adam.exampleone.ParentExFour;

public class ParentExFive
{
	protected int transactionId;
	protected int billNumber;
	public ParentExFive()
	{
		System.out.println("Start of ParentExFive()");
		System.out.println("End of ParentExFive()");
	}
	public ParentExFive(int transactionId,int billNumber)
	{
		this.transactionId= transactionId;
		this.billNumber = billNumber;
		System.out.println("End of ParentExFive parameterized constructor");
	}
	public String toString()
	{
		return "Transaction Id is : "+transactionId+" Bill number is : "+billNumber;
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method of ParentExFive");
		ParentExFour p1= new ParentExFour();
		int result = p1.addition(12,13);
		System.out.println("Result is "+result);
		System.out.println("End of Main Methodof ParentExFive ");
	}
}