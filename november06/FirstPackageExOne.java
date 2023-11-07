package com.sam.firstpackage;
public class FirstPackageExOne
{
	public FirstPackageExOne()
	{
	    System.out.println("Start of FirstPackageExOne");
	    System.out.println("End of FirstPackageExOne");

    }//end of constructor
    public void m1()
    {
    	System.out.println("m1 non-static method");

    }
    public static void main(String[]args)
    {
    	System.out.println("Start of Main Method");
    	FirstPackageExOne p1 = new FirstPackageExOne();
    	p1.m1();
	    System.out.println("End of Main Method");

    }//end of main method
}//end of class FirstPackageExOne