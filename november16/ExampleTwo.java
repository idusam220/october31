package bob.eric.exampleone;
public class ExampleTwo extends ExampleOne
{
	private double height;
	private double weight;

	private void  setHeight(double height)
	{
	this.height = height;
	}
	private double getHeight()
	{
	   return height;
	}

    private void setWeight(double weight)
	{
	this.weight = weight;
	}
	private double getWeight()
	{
	   return weight;
	}
	public static void main(String[]args)
	{
       System.out.println("Start of ExampleTwo Main Method");
       ExampleTwo e2 = new ExampleTwo();
       e2.setHeight(12.3);
       e2.setWeight(56.7);
       double yourHeight = e2.getHeight();
       double yourWeight = e2.getWeight();
       System.out.println("Your Height is = "+yourHeight);
       System.out.println("Your weight is = "+yourWeight);
       e2.id = 201;
       e2.name = "Patric";
       e2.income = 9000.00;
       System.out.println("Your Id is = "+e2.id);
       System.out.println("Your name is = "+e2.name);
       System.out.println("Your Income is = "+e2.income);

       System.out.println("End of ExampleTwo Main Method");
	}
}