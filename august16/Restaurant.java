public class Restaurant
{
			String name;
	        int    items;
	        double price;
	        String location;
	        public Restaurant(String name,int items,double price,String location)
	        {
	          System.out.println("Start of Restaurant constructor");
	          this.name     = name;
	          this.items    = items;
	          this.price    = price;
	          this.location = location;
	          System.out.println("Name is : "+ name + " items are : " + items + " Price is "+price + " location is : "+location );
	        }
	        public void display()
	        {
	        	System.out.println("Start of display method");
	        	System.out.println("Restaurant name is : "+name);
	        	System.out.println("Items are : "+items);
	        	System.out.println("Price is : "+price);
	        	System.out.println("location is : "+location);
	        	System.out.println("End of display Method");
	        }
}