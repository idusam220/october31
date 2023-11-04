public class ConcreteClassExTwo extends AbstractClassExOne
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		AbstractClassExOne ac1 = new ConcreteClassExTwo();
		System.out.println(ac1.age);
		System.out.println(ac1.income);
		System.out.println(ac1.companyName);
		System.out.println("End of Main Method");
	}
}