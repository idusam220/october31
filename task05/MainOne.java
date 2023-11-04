public class MainOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   ParentExEleven p11 = new ParentExEleven();
	   boolean pvalueOne = p11.m1(true);
	   System.out.println("The parent value one  is "+pvalueOne);
	   String pvalueTwo = p11.m1("Douglas");
	   System.out.println("The Parent name is "+pvalueTwo);
	   char pvalueThree = p11.m2('k');
	   System.out.println("parent value Three is " +pvalueThree);
	   byte pvalueFour = p11.m3((byte)12);
	   System.out.println("parent value four is "+pvalueFour);
	   System.out.println("=================================");
	   ParentExEleven p12 = new ChildExTen();
	   boolean cTenValueOne = p12.m1(true);
	   System.out.println("The Child Ten value one  is "+cTenValueOne);
	   String cTenValueTwo = p12.m1("Sam");
	   System.out.println("The Child ten name is "+cTenValueTwo);
	   char cTenValueThree = p12.m2('w');
	   System.out.println("Child ten value Three is " +cTenValueThree);
	   byte cTenValueFour = p12.m3((byte)2);
	   System.out.println("Child ten value four is "+cTenValueFour);
	   ChildExTen c10 = new ChildExTen();
	   System.out.println("=================================");
	   ParentExEleven p13 = new ChildExTwelve();
	   boolean cTwelveValueOne = p13.m1(false);
	   System.out.println("The Child Twelve value one  is "+cTwelveValueOne);
	   String cTwelveValueTwo = p13.m1("Haley");
	   System.out.println("The Child Twelve name is "+cTwelveValueTwo);
	   char cTwelveValueThree = p13.m2('e');
	   System.out.println("Child Twelve value Three is " +cTwelveValueThree);
	   byte cTwelveValueFour = p13.m3((byte)21);
	   System.out.println("Child Twelve value four is "+cTwelveValueFour);
	   ChildExTwelve c12 = new ChildExTwelve();
	   char cTwelveValue = c12.m5('h');
	   System.out.println("value  is "+cTwelveValue);
	   System.out.println("=================================");
	   ChildExTen c11 = new ChildExOne();
	   boolean cOne = c11.m1(true);
	   System.out.println("The Child one value is "+cOne);
	   String cTwo = c11.m1("Haley");
	   System.out.println("The Child two name is "+cTwo);
	   char cThree = c11.m2('q');
	   System.out.println("Child  value Three is " +cThree);
	   byte cFour = c11.m3((byte)20);
	   System.out.println("Child  value four is "+cFour);
	   String cTwelveName = c11.m1("Kate");
	   System.out.println("The Name is "+cTwelveName);
	   ChildExOne c1 = new ChildExOne();
	   c1.r1(true);
	   System.out.println("============================");
	   ChildExTwelve c13 = new ChildExTwo();
	   boolean childOne = c13.m1(false);
	   System.out.println("The Child one value is "+childOne);
	   String childTwo = c13.m1("Venant");
	   System.out.println("The Child two name is "+childTwo);
	   char childThree = c13.m2('u');
	   System.out.println("Child  value Three is " +childThree);
	   byte childFour = c13.m3((byte)44);
	   System.out.println("Child  value four is "+childFour);
	   char childFive = c13.m5('b');
	   System.out.println("The value is "+childFive);
	   ChildExTwo c2 = new ChildExTwo();
	   c2.p1('i');

	   System.out.println("End of Main Method");
	}
}