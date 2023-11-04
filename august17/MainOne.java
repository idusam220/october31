public class MainOne
{
  public static void main(String[]args)
  {
	System.out.println("Start of Main Method");
	StaticExOne m1 = new StaticExOne();
	StaticExOne s2 = new StaticExOne("New Jersey");
	StaticExOne s3 = new StaticExOne("Texas");
	StaticExOne.s1();
	StaticExOne.m2();
	StaticExOne.main(10);
    System.out.println("End of Main Method");
  }
}