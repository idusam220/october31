public class ImplicitTypeCastingExampleThree
{
	public static void main(String[]args)
	{
		byte valueOne      =23;
		short valueTwo     =34;
		int  valueThree    =valueOne;
		int valueFour      =valueTwo;
		long valueFive     =valueOne;
		long valueSix      =valueTwo;
		long valueSeven    =valueThree;
		float valueEight   =valueSeven;
		double valueNine   =valueTwo;
		double valueTen    =valueFour;
        double valueEleven = valueFive;
        System.out.println("Value One is ="+valueOne);
        System.out.println("value two is ="+valueTwo);
        System.out.println("Value Three is ="+valueThree);
        System.out.println("Value Four is ="+valueFour);
        System.out.println("value Five is ="+valueFive);
        System.out.println("Value six is ="+valueSix);
        System.out.println("Value Seven is ="+valueSeven);
        System.out.println("Value Eight is ="+valueEight);
        System.out.println("value naine is ="+valueNine);
        System.out.println("Value ten is ="+valueTen);
        System.out.println("value Eleven is ="+valueEleven);

	}
}