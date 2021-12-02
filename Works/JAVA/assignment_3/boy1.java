/*1)declaring protected method inside parent class and inherting that in subclass, 
show usage of all access modifiers in separate methods, public private protected and default.*/

class Human{
	
	void msg() //default
	{
		System.out.println("message is printed");
	}
	
	public void getmsg()
	{
		System.out.println("this is a public method");
	}
	protected void showmsg()
	{
		System.out.println("this is a protected method");
	}
	
}
class boy1 extends Human{
	
	private void print()
	{
		System.out.println("this is a private method");
	}
 public static void main(String args[]){
	
	boy1 b= new boy1();
	b.print();
	b.msg();
	b.getmsg();
	b.showmsg();
	
}
}