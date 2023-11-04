public class Animal
{
	String name;
	int    age;

	public void breathe()
    {
       System.out.println("Start of breathe method");
       System.out.println("Every Animal breathes Oxygen");
       System.out.println("End of breathe method");
    }
    public void eat()
    {
    	System.out.println("Start of eat animal class method");
    	System.out.println("Every animal eats their own food");
    	System.out.println("End of eat animal class method");
    }
    public void move()
    {
    	System.out.println("Start of move Animal class method");
    	System.out.println("Some animals walk some do not walk");
    	System.out.println("End of move Animal class method");
    }
}