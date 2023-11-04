public class ChildExTwo extends ParentExOne
{
    static int a = 10;
    static double b = 12.1;
    static{
        System.out. println("Start of First Static Block of Child ExTwo");
        System.out.println("End of First Static Block of ChildExTwo");
    }
    public static void m4()
    {
        System.out. println("Start of static m4() method");
        System.out.println(b);
        System.out.println("End of static m4() method");
    }
    static
    {
        System.out.println("Start of Second Static Block of ChildExTwo");
        System.out.println(a);
        System.out.println(b);
        System.out.println("End of Second Static Block of ChildExTwo"); 
        m4();
    }
    public static void main(String[]args)
    {
        System.out.println("Start of ChildEx Main Method"); 
        m4();
        System.out.println("End of ChildEx Main Method");
    }
    static int r = 45;
    static
    {
        System.out.println("Start of Static block");
        System.out.println("End of Static block");
        System.out.println(r);
    }
}