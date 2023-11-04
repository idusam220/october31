public class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Start of bark method of Dog class");
		System.out.println("All dogs ");
		System.out.println("End of bark method of Dog class");
	}
	@Override
	public void eat()
	{
		System.out.println("Start of eat method of Dog class");
		System.out.println("All dogs love to eat chicken and rice");
		System.out.println("End of eat method of Dog class");
	}
}