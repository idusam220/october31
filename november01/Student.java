public class Student
{
	
	public String  studentName;
	public int     studentId;
	public int     studentAge;
	public Address address;

	public double subjectOnemarks   = 67;
	public double subjectTwoMarks   = 78;
	public double subjectThreeMarks = 88;
	public double subjectFourMarks   = 90;

	public double calculatePercentageOfSubjects()
	{
		double percentage = (subjectOnemarks+subjectTwoMarks+subjectThreeMarks+subjectFourMarks)/4;
		return percentage;
	}
}