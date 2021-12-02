class Box{
	int width;
	double height;
	String name = "Hello";
	
	int test(int a)
	{
		width=a;
		return width*width;
	}
	double test(double b)
	{
		height=b;
		return height*height;
	
	}
	void test(String c)
	{
		name=c;
		System.out.println(name);
	}
}
class TestDEmo{
	
	
	public static void main(String args[])
	{
		Box b= new Box();
		int r;
	     double q;
		r= b.test(5);
		q= b.test(20.5);
		b.test("hello");
		System.out.println(r);
		System.out.println(q);
		
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
}