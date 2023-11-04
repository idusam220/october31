public abstract class Animal
{
	abstract void eat();
	public void breathe()
	{
       System.out.println("Start of non-static breathe method");
       System.out.println("All animals breathe O2");
       System.out.println("End of non-static breathe method");
	}

}