public class ChildExTwo extends ParentExOne
{
	public String n1(int i)
	{
	   System.out.println("Start of n1 method of class ChildExTwo");
	   System.out.println(i);
	   System.out.println("End of n1 method of class ChildExTwo");
	   return "Peter";
	}
	
		public String n2(String name)
		{
			System.out.println("Start of n2 method of class ChildExTwo");
	        System.out.println(name);
	        System.out.println("End of n2 method of class ChildExTwo");
	        return "Mark";
        }
        public String n3()
        {
        	System.out.println("Start of n3 method of class ChildExTwo");
	        System.out.println("End of n3 method of class ChildExTwo");
	        return "Eric";
        }
        public double n4(double income)
        {
        	System.out.println("Start of n4 method of class ChildExTwo");
	        System.out.println(income);
	        System.out.println("End of n4 method of class ChildExTwo");
	        return income;
	    }
	    public int n5(int i)
	    {
	    	System.out.println("Start of n5 method of class ChildExTwo");
	        System.out.println(i);
	        System.out.println("End of n5 method of class ChildExTwo");
	        return i;
	    }
}