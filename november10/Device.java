package sam.rwanda.device;
public class Device
{
	private String deviceId;
	private String deviceName;
	private double devicePrice;

	public Device(){
		System.out.println("Start of Device constructor");
		System.out.println("End of Device constructor");
	}
	public Device(String manufacture)
	{
		System.out.println("Start of Device Parameterized constructor");
		System.out.println("End of Device parameterized  constructor");
	}
	public void setDeviceId(String deviceId)
	{
		this.deviceId = deviceId;
	}
	public String getDeviceId()
	{
		return deviceId;
	}
	public void setDeviceName(String deviceName)
	{
		this.deviceName = deviceName;
	}
	public String getDeviceName()
	{
		return deviceName;
	}
	public void setDevicePrice(double devicePrice)
	{
		this.devicePrice = devicePrice;
	}
	public double getDevicePrice()
	{
		return devicePrice;
	}
}