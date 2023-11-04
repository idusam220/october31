public class MainOne
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    Animal a1 = new Animal();
	    Fish   f1 = new Fish();
	    Dog    d1 = new Dog();
	    f1.name = "Jelly";
	    f1.age  = 6;
	    d1.name = "Rambo";
	    d1.age  = 7;
	    f1.breathe();
	    f1.eat();
	    f1.move();
	    System.out.println("Fish name is : "+f1.name);
	    System.out.println("Fish age is : "+f1.age);
	    d1.breathe();
	    d1.eat();
	    d1.move();
	    d1.protector();
	    System.out.println("Dog name is : "+d1.name);
	    System.out.println("Dog age is : "+d1.age);
	    a1.breathe();
	    a1.eat();
	    a1.move();
	    System.out.println("End of Main Method");


	}
}