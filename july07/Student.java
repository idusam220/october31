public class Student
{
	String studentName;
	int studentId;
	static String studentUniversity="University of Venant";
	public void study(int numberOfhours)
	{
	System.out.println("Need to study long hours");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		Student s1 = new Student();
		Student s2 = new Student();
		s1.studentName="David";
		s1.studentId =101;
		System.out.println("Student One Name is :"+s1.studentName);
		System.out.println("Student One Id is :"+s1.studentId);
		System.out.println("Student One University Name is :"+s1.studentUniversity);
         s2.studentUniversity ="University of Sam";
         s2.studentName ="Mark";
		s2.studentId=211;
		System.out.println("Student Two Name is :"+s2.studentName);
		System.out.println("Student Two Id is :"+s2.studentId);
		System.out.println("Student Two University Name is "+s2.studentUniversity);
		s1.studentName ="Kyle";
		System.out.println("Student One Name is :"+s1.studentName);
		System.out.println("Student One University Name is :"+s1.studentUniversity);
		System.out.println("End of Main Method");
	}
}