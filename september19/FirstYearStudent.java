public class FirstYearStudent extends Student
{
	public FirstYearStudent(int studentId,String studentName,double studentAge,int studentGrade)
	{
		super(studentId,studentName,studentAge,studentGrade);
	}
	@Override
	public void submitAssignment(int numberOfAssignment)
	{
		System.out.println("Start of non-static submitAssignment() of FirstYearStudent class");
		System.out.println(numberOfAssignment+" submitted");
		System.out.println("End of non-static submitAssignment() of FirstYearStudent class");
	}
}