public class McDonalds implements Payment
{
	@Override
	public void payByCash()
	{
		System.out.println("Start of payByCash() method of McDonalds");
		System.out.println("End of payByCash() method of McDonalds");
	}
	@Override
	public void payByCreditCard()
	{
		System.out.println("Start of payByCreditCard() method of McDonalds");
		System.out.println("End of payByCreditCard() method of McDonalds");
	}
	@Override
	public void payByDebitCard()
	{
		System.out.println("Start of payByDebitCard() method of McDonalds");
		System.out.println("End of payByDebitCard() method of McDonalds");
	}
}
