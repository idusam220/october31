public class Dog extends Animal
{
	// Constructor
	public Dog(String name, int animalId,double price )
	{
		super(name,animalId,price);
	}
	@Override
	public void canEat()
	{
	  System.out.println("Dog eats meat");
	}
}