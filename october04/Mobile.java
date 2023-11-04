public class Mobile implements Device,TouchScreen
{
	@Override
	public void turnOn()
	{
		System.out.println("Press the key to turnOn your Mobile");
	}
	@Override
	public void turnOff()
	{
		System.out.println("Press the key twice to turn off your Mobile");
	}
	@Override
	public void touch()
	{
		System.out.println("Start of touch() of Mobile class");
		System.out.println("By touching the mobile screen we can access it ");
		System.out.println("End of touch() of Mobile class");
	}
}