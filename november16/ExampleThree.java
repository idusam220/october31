package bob.eric.exampleone;
public class ExampleThree
{
    private String houseNumber ;
    public  String city;
    private String country;

    public ExampleThree()
    {
    	System.out.println("Start of ExampleThree()constructor");
    	System.out.println("End of ExampleThree()constructor");

    }
	private void setHouseNumber(String houseNumber)
	{
	    this.houseNumber = houseNumber;
	}
	private String getHouseNumber()
	{
	   return houseNumber;
	}
	private void setCity(String city)
	{
	   this.city = city;
	}
	private String getCity()
	{
	   return city;
	}

	private void setCountry(String country)
	{
	    this.country = country;
	}
	private String getCountry()
	{
	   return country;
	}

	public static void main(String[]args)
	{
		System.out.println("Start of ExampleThree Main Method");
		ExampleThree e3 = new ExampleThree();
		e3.setHouseNumber("123 street 5");
		e3.setCity("LA");
		e3.setCountry("USA");
		String yourHouseNumber = e3.getHouseNumber();
		String yourCity = e3.getCity();
		String yourCountry = e3.getCountry();
		System.out.println("HouseNumber = "+yourHouseNumber);
		System.out.println("City is = "+yourCity);
		System.out.println("Country is = "+yourCountry);
        System.out.println("Your Id is = "+e3.id);
        System.out.println("Your name is = "+e3.name);
        System.out.println("Your Income is = "+e3.income);

		System.out.println("End of ExampleThree Main Method");

	}
}