public class ChildExOne extends ParentExOne
{
	public String n1(int i)
	{
	   System.out.println("Start of n1 method of class ChildExOne");
	   System.out.println("The value of i is : "+i);
	   System.out.println("End of n1 method of class ChildExOne");
	   return "Kigali";
	}
	
		public String n2(String name)
		{
			System.out.println("Start of n2 method of class ChildExOne");
	        System.out.println(name);
	        System.out.println("End of n2 method of class ChildExOne");
	        return "Venant";
        }
        public String n3()
        {
        	System.out.println("Start of n3 method of class ChildExOne");
	        System.out.println("End of n3 method of class ChildExOne");
	        return "Paul";
        }
        public double n4(double income)
        {
        	System.out.println("Start of n4 method of class ChildExOne");
	        System.out.println(income);
	        System.out.println("End of n4 method of class ChildExOne");
	        return 5.0;
	    }
	    public int n5(int i)
	    {
	    	System.out.println("Start of n5 method of class ChildExOne");
	        System.out.println(i);
	        System.out.println("Start of n5 method of class ChildExOne");
	        return i;
	    }
}