public class Animal
{
	public String name;
	public int animalId;
	public double price;

	// Constructor
	public Animal(String name, int animalId,double price )
	{
       this.name = name;
       this.animalId = animalId;
       this.price = price;
	}

	public void canEat()
	{
		System.out.println("All animals eat");
	}
	@Override
	public String toString()
	{
		return " Animal Name : "+name + " Animal Id " +animalId + " Animal Price : "+price;
	}

}