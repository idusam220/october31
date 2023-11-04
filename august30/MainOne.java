public class MainOne
{
	public static void main(String[]args)
    {
       System.out.println("Start of Main Method");
       ParentExOne p1 = new ParentExOne();
       p1.m1('R');
       int pvalueOne = p1.m2();
       System.out.println("Parent value One is "+pvalueOne);
       // p1.m3(); It will give a compiler error because m3 method is a private method.
       System.out.println("=====================================");
       ChildExOne c1 = new ChildExOne();
       c1.m1(90);
       c1.m4();
       int cvalueOne = c1.m2();
       //c1.m3(); java compiler will give an error because m3 method is a private method of class ParentExone.
       System.out.println("Child value one is "+cvalueOne);
       System.out.println("=================================");
       ChildExTwo c2 = new ChildExTwo();
       c2.m1(77);
       int cvalueTwo = c2.m2();
       c2.m5();
       System.out.println("Child value Two is "+cvalueTwo);
       System.out.println("End of Main Method");
    }
}