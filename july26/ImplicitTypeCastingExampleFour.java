public class ImplicitTypeCastingExampleFour
{
 public static void main(String[]args)
 {
  System.out.println("Start of Main Method");
  boolean valueOne = true;
  boolean valueTwo =false;
  int valueThree   =valueOne;
  long valueFour   =valueTwo;
  float valueFive  =valueOne;
  double valueSix  =valueTwo;
  System.out.println("Value One is ="+valueOne);
  System.out.println("Value two is ="+valueTwo);
  System.out.println("Value Three is ="+valueThree);
  System.out.println("Value Four is ="+valueFour);
  System.out.println("Value Five is ="+valueFive);
  System.out.println("Value Six is ="+valueSix);
  System.out.println("End of Main Method");

  }

	
}