import java.util.Hashtable;
public class HashtableDemo
 {
   public static void main(String[]args) 
   {
     //Hashtable t=new Hashtable(); // capacity is 11, load factor 0.75
     //Hashtable t=new(initial capacity); // create hashtable object with some capacity //Hashtable tanew Hashtable(initial capacity, fill ratio/load factor);
     Hashtable <Integer, String> t=new Hashtable<Integer, String> ();
     t.put (101, "John");
     t.put (102, "David"); 
     t.put (103, "Smith");
     //t.put(null, "X"); //NullPointerException t.put (104, null);
     System.out.println(t);
   }
}