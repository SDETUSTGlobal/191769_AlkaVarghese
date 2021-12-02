/*4)Swtich case with following case scenarios: 
a- Java Program to Display Odd Numbers From 1 to 100
b- Java Program to Display Even Numbers From 1 to 100
c- Java Program to Check if a Given Number is Perfect Square
d- Java Program to Check if a Number is Positive or Negative
e- Java Program to Find Largest of Three Numbers
f- How to Reverse a Number in Java
*/
import java.io.*;
import java.util.Scanner; // package having scanner class
public class SwitchCase {

   public static void main(String args[]) {
      
      char opt;
	  Scanner x = new Scanner(System.in);
	  System.out.println("Enter a valid option :");
	  opt= x.next().charAt(0);

      switch(opt) {
         case 'A' : System.out.println("Odd Numbers From 1 to 100 are:"); 
		              for(int i=1;i<=100;i++)
			            {
				           if(i%2 !=0)
				           System.out.println(i+" ");
			            }
            
            break;
         case 'B' : System.out.println(" Even Numbers From 1 to 100 are:"); 
		             for(int i=1;i<=100;i++)
			           {
				          if(i%2 ==0)
				          System.out.println(i+" ");
			           }
            
            break;
         case 'C' : System.out.println("Given Number is Perfect Square");
                      int k,temp=0;
					  Scanner v = new Scanner(System.in);
					  System.out.println("Enter a number :");
		              k = v.nextInt()  ;
					  for(int j=1;j<=k;j++)
					  {
						  if(k%j == 0 && k/j == j)
							  temp++;
					  }
					  if(temp!=0)
					  System.out.println(k+ "is a perfect square");
				  break;
         case 'D' : System.out.println(" Number is Positive or Negative");
		              int n;
				      System.out.println("Enter a number :");
				      Scanner sc = new Scanner(System.in); //system.in is a std input stream
				      n = sc.nextInt(); //used to input an integer value

				       if (n > 0)
				         System.out.println("positive integer");
					    
						else 
				         System.out.println("negative integer");
				 
				
				
				
		    break;
            
         case 'E' : System.out.println("Find Largest of Three Numbers");
                      int a,b,c;
					  System.out.println("Enter 3 number :");
					  Scanner d = new Scanner(System.in);
					 a = d.nextInt(); 
					 b = d.nextInt();
					 c = d.nextInt();
					 if(a>b && a>c)
						 System.out.println("a is largest"+ a);
					 else if(b>a && b>c)
						 System.out.println("b is largest"+ b);
					 else
						 System.out.println("c is largest"+ c);
            break;
		 case 'F' : System.out.println("Reverse a Number");
                     int p,q, rev=0;
					 System.out.println("Enter a number :");
					 Scanner e = new Scanner(System.in);
					 p = e.nextInt();
					 while(p!=0)
					 {
						 q= p%10;
						 rev= (rev*10)+q;
						 p/=10;
					 }
					 System.out.println("Reversed no is :"+ rev);
            break;	
		
         default :
            System.out.println("Invalid Option");
      }
      
   }
}
