public class ParentExOne
{
   static String companyName = "JavaWorld";
   static int establishYear = 1995;
   static
   {

        System.out.println("Start of First Static Block of ParentExOne");
         m2();
        System.out.println("End of First Static Block of ParentExOne");
   }

   static{
         System.out.println("Start of Second Static Block of ParentExOne");
         System.out.println ("Company Name is = "+ companyName);
         System.out.println("End of Second Static Block of ParentExOne");
    }
    public static void m2()
    {
         System.out.println("Start of static m2() of ParentExOne");
         System.out.println(companyName);
         System.out.println(establishYear);
         System.out. println("End of static m2() of ParentExOne");

    }
    static{

         System.out. println("Start of Third Static block of ParentExOne"); 
         System.out.println("End of Third Static block of ParentExOne");
         System.out.println(companyName);
    }

    static int x = 21;

    public static void main(String[]args){

        System.out.println("Start of Main Parent Method");
        System.out.println(x);
        System.out.println(companyName);
        System.out.println("End of Main Parent Method");
    }
}