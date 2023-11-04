public class Television implements Device,TouchScreen
{
	@Override
	public void turnOn()
	{
		System.out.println("Start of turnOn()method");
		System.out.println("Press the button on the tv to turn it on");
		System.out.println("End of turnOn()method");
	}
	@Override
	public void turnOff()
	{
		System.out.println("Start of turnOff()method");
		System.out.println("Pressthe button on the remote control to turn off the tv");
		System.out.println("End of turnOff() method");
	}
	@Override
	public void touch()
	{
		System.out.println("Start of touch()method");
		System.out.println("Touch can provide great flexibility");
		System.out.println("End of touch() of Television class");
	}
}