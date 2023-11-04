
abstract class Main 
// abstract class
{
  String fName = "John";
  String lName = "Doe";
  String email = "idusam220@gmail.com";
  int age  =23;
  
}
 
  public class Student extends Main 
   {
       int graduationYear = 2018;
    
       public void study()
        {
          System.out.println("Study all day long");
        } 
   
    public static void main(String[]args)
    {
       Student st =new Student();
  
       System.out.println("Name  :"+st.fName + " "+st.lName);
       System.out.println("Email :"+st.email);
       System.out.println("Age  :"+st.age);
       System.out.println("Graduation year  :"+st.graduationYear);
       st.study();
    }
  }
  