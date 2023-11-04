public class Amazon implements Payment
{
	@Override
	public void payByCash()
	{
		System.out.println("Start of payByCash() method of Amazon");
		System.out.println("End of payByCash() method of Amazon");
	}
	@Override
	public void payByCreditCard()
	{
		System.out.println("Start of payByCreditCard() method of Amazon");
		System.out.println("End of payByCreditCard() method of Amazon");
	}
	@Override
	public void payByDebitCard()
	{
		System.out.println("Start of payByDebitCard() method of Amazon");
		System.out.println("End of payByDebitCard() method of Amazon");
	}
}