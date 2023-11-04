public class MainOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	  // Animal a = new Animal();
	   Fish fish = new Fish();
	   fish.breathe();
	   fish.eat();
	   fish.swim();
	   System.out.println("=====================");
	   Dog dog = new Dog();
	   dog.eat();
	   dog.bark();
	   dog.eat();
	   System.out.println("End of Main Method");
	}
}