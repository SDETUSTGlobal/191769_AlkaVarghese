/*1)Create one program for each Inheritance(IS-A) ( Single , Multi Level , Hierarchical)
a- Single inheritance with this keyword and Instance Initializer block.
b - Multilevel inheritance with super keyword for variable , method and class
c- Hierarchical inheritance with static and final keyword , method and class. 
*/
class Box{
	int a;
	int b;
	void setData(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	
}
class Demo extends Box{
	
	void showData()
	{
		System.out.println("Value of a:"+ a);
		System.out.println("Value of b:"+ b);
		
	}
}
class SimpleInheritance{
	
	public static void main(String args[]){
	{System.out.println("Printing Instance Initializer block");}
	 Demo d = new Demo();
	 d.setData(10,20);
	 d.showData();
		
	}
}
