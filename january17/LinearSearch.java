public class LinearSearch
{
	public static void main(String[]args)
	{
	   int []nums = {1,2,3,4,5,6,7,8,9,10};
	   int target = 7;
	   int result = linearSearch (nums, target);
	   if(result!= -1)
	   System.out.println("The index of the target is " +result );
       else 
       System.out.println("No index found");
      
	}
	public static int linearSearch(int []nums,int target)// to search ofr find number stored in an array
    {
        
	    for(int i = 0;i<nums.length;i++)
	   {

	       if(nums[i]== target)

	       return i;
	       
         
	   }
	   return -1;
	}
}