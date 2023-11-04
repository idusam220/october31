public class KFC implements Payment
{
	@Override
	public void payByCash()
	{
		System.out.println("Start of payByCash() method of KFC");
		System.out.println("End of payByCash() method of KFC");
	}
	@Override
	public void payByCreditCard()
	{
		System.out.println("Start of payByCreditCard() method of KFC");
		System.out.println("End of payByCreditCard() method of KFC");
	}
	@Override
	public void payByDebitCard()
	{
		System.out.println("Start of payByDebitCard() method of KFC");
		System.out.println("End of payByDebitCard() method of KFC");
	}
}
