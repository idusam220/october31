public class ChildExThree extends ParentExOne
{
	public String n1(int i)
	{
	   System.out.println("Start of n1 method of class ChildExThree");
	   System.out.println(i);
	   System.out.println("End of n1 method of class ChildExThree");
	   return "Kate";
	}
	
		public String n2(String name)
		{
			System.out.println("Start of n2 method of class ChildExThree");
	        System.out.println(name);
	        System.out.println("End of n2 method of class ChildExThree");
	        return "Sam";
        }
        public String n3()
        {
        	System.out.println("Start of n3 method of class ChildExThree");
	        System.out.println("End of n3 method of class ChildExThree");
	        return "Mary";
        }
        public double n4(double income)
        {
        	System.out.println("Start of n4 method of class ChildExThree");
	        System.out.println(income);
	        System.out.println("End of n4 method of class ChildExThree");
	        return income;
	    }
	    public int n5(int i)
	    {
	    	System.out.println("Start of n5 method of class ChildExThree");
	        System.out.println(i);
	        System.out.println("End of n5 method of class ChildExThree");
	        return i;
	    }
}