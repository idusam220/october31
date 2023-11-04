public class Laptop implements Device,TouchScreen
{
	@Override
	public void turnOn()
	{
		System.out.println("Press the button to turnOn the laptop");
	}
	@Override
	public void turnOff()
	{
		System.out.println("Press the button to turn off the laptop");
	}
	public void touch()
	{
		System.out.println("All the modern laptops have touch facility");
	}
}