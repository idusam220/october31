public class MainOne
{
	public static void main(String[]sam)
	{
	   System.out.println("Start of Main Method");
	   SportPerson  sp1 = new SportPerson();
	   Boxer        b1  = new Boxer();
	   Footballer   fb1 = new Footballer();
	   Basketballer bb1 = new Basketballer();
	   sp1.diet();
	   sp1.play();
	   b1.diet();
	   b1.play();
	   fb1.diet();
	   fb1.play();
	   bb1.diet();
	   bb1.play();
	   //sp1.m1();
	   b1.m1();
	   //fb1.m1();
	   sp1.name = "Harris";
	   sp1.age = 23;
	   b1.name = "Kyle";
	   b1.age = 22;
	   fb1.name = "Messi";
	   fb1.age = 37;
	   bb1.name ="Bob";
	   bb1.age = 31;
	   System.out.println("Sport person name is : "+sp1.name);
	   System.out.println("Sport person age is : "+sp1.age);
	   System.out.println("Boxer name is : "+b1.name);
	   System.out.println("Boxer age is : "+b1.age);
	   System.out.println("Footballer name is : "+fb1.name);
	   System.out.println("Footballer age is : "+fb1.age);
	   System.out.println("Basketballer name is : "+bb1.name);
	   System.out.println("Basketballer age is : "+bb1.age);
	   System.out.println("End of Main Method");
	}
}