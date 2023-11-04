public class MainOne
{
	public static void main(String[]args)
	{
		System.out.println("start of Main Method");
		Student s1 = new Student();
		s1.setStudentName("James Gosling");
		s1.setStudentId(101);
		s1.setStudentPassword(12345);
		String studentName = s1.getStudentName();
		int studentId      = s1.getStudentId();
		int studentPassword= s1.getStudentPassword();
		System.out.println("Student name is : "+studentName);
		System.out.println("Student Id is : "+studentId);
		System.out.println("Student Password is : "+studentPassword);
		System.out.println("End of Main Method");
	}
}