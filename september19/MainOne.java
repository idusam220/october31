public class MainOne
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		Student s1 = new Student(101,"Harris",21.5,1);
		s1.study();
		s1.submitAssignment(5);
		System.out.println(s1);
		System.out.println("==========================");
		Student fy1 = new FirstYearStudent(201,"Kyle",25,2);
		fy1.study();
		fy1.submitAssignment(10);
		System.out.println(fy1);
		System.out.println("==========================");
		Student sy1 = new SecondYearStudent(301,"Jack",27,3);
		sy1.study();
		sy1.submitAssignment(15);
		System.out.println(sy1);
		System.out.println("End of Main Method");

	}
}