public class Student
{
	private String studentName;
	private int studentId;
	private int studentPassword;
    
    //@setter
    public void setStudentName(String studentName)
    {
    	this.studentName = studentName;
    }
    //@getter
    public String getStudentName()
    {
    	return studentName;
    }
    //@setter
    public void setStudentId(int studentId)
    {
    	this.studentId= studentId;
    }
   // @getter
    public int getStudentId()
    {
    	return studentId;
    }
    //@setter
    public void setStudentPassword(int studentPassword)
    {
    	this.studentPassword= studentPassword;
    }
    //@getter
    public int getStudentPassword()
    {
    	return studentPassword;
    }
}