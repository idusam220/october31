public class BasketBaller extends SportPerson
{
	public BasketBaller()
	{
        super();
        System.out.println("Start of BasketBaller constructor");
        System.out.println("End of BasketBaller constructor");
	}
	@Override
	public void diet()
	{
		System.out.println("Start of BasketBaller diet() method");
		System.out.println("All BasketBallers eat burger,sandwiches and drink milk");
		System.out.println("end of BasketBaller diet()method");
	}
}