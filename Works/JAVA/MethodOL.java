/*2)Method overloading
5 methods with diffrent parameters to calculate 
percentage
avergae
mediun 
max
min
var  5*/

class MethodOL{
     int p, min, max;
	 double avg, med;
	 
	 void calcu(int n)
	 {
		p = n/100;
		System.out.println("percentage = "+ p);
	 }
	 
	 void calcu(int a, int b)
	 {
		 if(a>b)
			 System.out.println("a is greater:"+ a);
		 else
			 System.out.println("b is greater:"+ b);
		 
	 }
	 void calcu(int x, int y, int z)
	 {
		 if(x<y && x<z)
			 System.out.println("x is smaller:"+ x);
		 
		 else if(y<x && y<z)
			 System.out.println("y is smaller:"+ y);
		 
		 else
			 System.out.println("z is smaller:"+ z);
		 	 
	 }
	 /*void calcu(int q, int r, int s, int t)
	 {
		 med = (q+r+s+t)/2;
		 System.out.println("median :"+ med);*/
		 
	 }
	 void calcu(int g, int h, int i, int j, int k)
	 {
		 avg = (g+h+i+j+k)/5;
		 System.out.println("average is:"+ avg);
	 }
	 
	public static void main(String args[])
	{
		MethodOL obj = new MethodOL();
		obj.calcu(500);
		obj.calcu(40,35);
		obj.calcu(50,25,50);
		obj.calcu(10,20,30,40);
		obj.calcu(5,10,15,20);
	}
	
	
}