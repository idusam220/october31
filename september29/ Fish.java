public class Fish extends Animal
{
	public void swim()
	{
		System.out.println("Start of non-static swim method ");
		System.out.println("All Fishes can swim in the sea,in the ocean and in the aquirium");
		System.out.println("End of non-static swim method ");
	}
	@Override
	public void eat()
	{
        System.out.println("Start of non-static eat method of Fish class");
        System.out.println("All fishes eat seeds");
        System.out.println("End of non-static eat method of Fish class");
	}
}