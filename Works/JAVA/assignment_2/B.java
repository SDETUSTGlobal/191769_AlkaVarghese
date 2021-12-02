/*3)Create one program with Method oevrriding ,Runtime Polymorphism , Dynamic Binding and instanceof operator.*/
class A{
	void run()
	{
	System.out.println("this is class A");
	}
}
class B extends A{
	void run()
	{
		System.out.println("This is class B");
	}
	public static void main(String args[]){
		
	A obj = new B();
	obj.run();
	System.out.println(obj instanceof A);
	}
}