public class SecondYearStudent extends Student
{
	public SecondYearStudent(int studentId,String studentName,double studentAge,int studentGrade)
	{
		super(studentId,studentName,studentAge,studentGrade);
	}
	@Override
	public void submitAssignment(int numberOfAssignment)
	{
		System.out.println("Start of non-static submitAssignment() of SecondYearStudent class");
		System.out.println(numberOfAssignment+" submitted");
		System.out.println("End of non-static submitAssignment() of SecondYearStudent class");
	}
}