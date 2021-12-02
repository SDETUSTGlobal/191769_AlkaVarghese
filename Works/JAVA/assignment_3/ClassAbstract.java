//3)Create Abstract Class having constructor, data member and method and show nested inheritance.
interface Bag
{	
	interface Pouch
	{
		void box();		
	}
}
abstract class Uniform{
	
	abstract void num();
	
	Uniform()
	{
		System.out.println("this is abstract class");
	}
}
class Dress extends Uniform{
	void num()
	{
		System.out.println("welcome..welcome");
	}
	
}
class ClassAbstract implements Bag.Pouch{
	public void box(){
		System.out.println("box..box..box");
	}
	public static void main(String args[]){
		Bag.Pouch p =  new ClassAbstract();
		p.box();
		Uniform u=new Dress();
		u.num();
	}
}