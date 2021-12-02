/*Constructor Overloading -
4 constructors 
a- no arguments
b - 1 argument int
c - 2 arugments int string 
d - 4 arguments int int int string 
method  - 4 methods 
addition , substraction , multiplication and divison.*/

class OverLoad{
	int x=10,y=2,z=3;
	String name= "Hello";
	OverLoad()
	{
	}
	OverLoad(int n)
	{
		x=n;
	}
	OverLoad(int a, String c)
	{
		x=a;
		//y=b;
		name=c;
	}
	OverLoad(int p, int q, int r, String s)
	{
		x=p;
		y=q;
		z=r;
		name=s;
	}
	void addition()
	{    int sum= x+y+z;
		 System.out.println(sum);
		 System.out.println(name);
	}
	void subtraction()
	{    int diff = (x-y-z);
		System.out.println(diff);
		 System.out.println(name);
	}
	void multiplication()
	{    int multi = x*y*z;
		System.out.println(multi);
		 System.out.println(name);
	}
	void division()
	{    int div = ((x/y)/z);
		System.out.println(div);
		 System.out.println(name);
	}
	
	public static void main(String args[]){
		OverLoad obj1 = new OverLoad();
		OverLoad obj2 = new OverLoad(25);
		OverLoad obj3 = new OverLoad(20,"Hello");
		OverLoad obj4 = new OverLoad(15,10,5,"Hello");
		
		obj1.addition();
		obj2.subtraction();
		obj3.multiplication();
		obj4.division();
	}
}