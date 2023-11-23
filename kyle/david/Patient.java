package sam.info.patient;
public class Patient 
{
	private String patientId;
	private String patientName;
	private String patientRoom;

    public void setPatientId(String patientId)
	{
		this.patientId = patientId;
	}
	public String getPatientId()
	{
		return patientId;
	}
	public void setPatientName(String patientName)
	{
		this.patientName = patientName;
	}
	public String getPatientName()
	{
		return patientName;
	}
	public void setPatientRoom(String patientRoom)
	{
		this.patientRoom = patientRoom;
	}
	public String getPatientRoom()
	{
		return patientRoom;
	}
}