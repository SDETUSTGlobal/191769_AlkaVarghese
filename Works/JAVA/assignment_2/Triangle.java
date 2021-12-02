/*4)Create one program with Abstract Class and Abstract method.*/
abstract class Shape{
	abstract void area();
}
class Triangle extends Shape{
	void area()
	{
		System.out.println("Triangle is a shape");
		
	}
	public static void main(String args[])
	{
		Shape ob1= new Triangle();
		ob1.area();
	}
	
	
}