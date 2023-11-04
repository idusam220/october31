public class MainThree
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");

		// Creating an object or Instantiation

                        // Constructor called
		Animal a1 = new Dog("Blue",201,5000.00);
		a1.canEat();
		//String myAnimal = a1.toString();
		System.out.println(a1 instanceof Animal);
		//System.out.println(myAnimal);

		// Whenever we trying to print an object
		// reference variable, then java compiler will add
		// toString() with it.
		// System.out.println("Dog details : " + a1.toString());
		System.out.println("Dog details : " +a1);

		System.out.println("End of Main Method");
	}
}