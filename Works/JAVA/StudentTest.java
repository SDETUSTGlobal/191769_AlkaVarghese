import java.io.*;
public class StudentTest {

   public static void main(String args[]) {
      /* Create two objects using constructor */
      Student1 one = new Student1("anvin");
      Student1 two = new Student1("aleena");
	  Student1 three = new Student1("alka");

      // Invoking methods for each object created
      one.studAge(20);
      one.studRank(55);
	  one.printStudent();

      two.studAge(20);
      two.studRank(20);
	  two.printStudent();
	  
	  three.studAge(19);
      three.studRank(25);
	  three.printStudent();
   }
}