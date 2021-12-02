/*2)Create one Program with Aggregation(HAS-A) with Array declaration.*/
import java.io.*;
class Book{
	
	void pen()
	{
		System.out.println("cello gripper is a good pen");
	}
}
class Pencil{
	Book b;
	
	void eraser()
	{
		b = new Book();
		b.pen();
	}
	public static void main(String args[])
	{
		Pencil p =  new Pencil();
		p.eraser();
		String month[]={"JAN","FEB","MARCH","APRIL","MAY"};	    
	    for( int i=0;i<month.length;i++)
	      {
	         System.out.println(month[i]);
	      }
	}
}