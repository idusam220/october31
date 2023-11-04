public class Main
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    Payment p1 = new Amazon();
	    Payment p2 = new McDonalds();
	    Payment p3 = new KFC();
	    p1.payByCash();
	    p1.payByCreditCard();
	    p1.payByDebitCard();
	    System.out.println("===========");
	    p2.payByCash();
	    p2.payByCreditCard();
	    p2.payByDebitCard();
	    System.out.println("==============");
	    p3.payByCash();
	    p3.payByCreditCard();
	    p3.payByDebitCard();
	    System.out.println("End of Main Method");
	}
}