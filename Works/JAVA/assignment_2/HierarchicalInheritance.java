/*1)Create one program for each Inheritance(IS-A) ( Single , Multi Level , Hierarchical)
c- Hierarchical inheritance with static and final keyword , method and class. 
*/

class Car{
	final int c=5;
	static void dealer()
	{
		System.out.println("This is car class \n");
	}
	
    final void run()
	{
		System.out.println("car is moving \n");
	}
	
}
class Hondacity extends Car{
	
	void machine()
	{
		System.out.println("This is Hondacity class \n");
	}
	
	void run()
	{
		System.out.println("car is moving \n");
	}
}
class Brio extends Car{
	
	void vehicle()
	{
		System.out.println("This is Brio class \n");
	}
	
}
class HierarchicalInheritance{
	
	public static void main(String args[]){
		
		
		Brio b = new Brio();
		b.vehicle();
		Car.dealer();
		Hondacity h = new Hondacity();
		h.run();
		
		
	}
}