public class Student
{
	 int studentId;
	 String studentName;
	 double studentAge;
	 int studentGrade;

	public Student(int studentId,String studentName,double studentAge,int studentGrade)
	{
		this.studentId   = studentId;
		this.studentName = studentName;
		this.studentAge  = studentAge;
		this.studentGrade= studentGrade;
	}
	public void study()
	{
		System.out.println("Start of non-static study() of Student class");
		System.out.println("End of non-static study() of Student class");
	}
	public void submitAssignment(int numberOfAssignment)
	{
		System.out.println("Start of non-static submitAssignment() of Student class");
		System.out.println("End of non-static submitAssignment() of Student class");
	}
	@Override
	public String toString()
	{
		return "Your student Id : "+studentId+" Student name is : "+studentName+" Student Age : "+studentAge+" Grade is : "+studentGrade;
	}


}