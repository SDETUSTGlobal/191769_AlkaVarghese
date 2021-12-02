/*1)Create one program for each Inheritance(IS-A) ( Single , Multi Level , Hierarchical)
b - Multilevel inheritance with super keyword for variable , method and class
*/
class Human{
	String color = "PINK";
	Human()
	{
		System.out.print("This is Human class \n");
	}
	void walk()
	{
		System.out.print("Human can walk \n ");
	}
	
}
class Boy extends Human{
	String color="RED";
	void colorprint()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	void walk()
	{
	 super.walk();
	 System.out.print("Boy can walk \n " );
	}
	
}
class Child extends Boy{
	
	Child()
	{
		super();
		System.out.print("This is Child class \n");
		
	}
	

}
class MultilevelInheritance{
	
	public static void main(String args[]){
		
		Child c=  new Child();
		 c.walk();
		 c.colorprint();
	}		
}