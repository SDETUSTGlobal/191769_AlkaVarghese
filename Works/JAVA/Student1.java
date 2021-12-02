import java.io.*;
public class Student1 {
   String name;
   int age, rank;
   
   
   public Student1(String name) {
      this.name = name;
   }

   
   public void studAge(int studAge) {
      age = studAge;
   }
   public void studRank(int studRank) {
      rank = studRank;
   }

   /* Print the Student details */
   public void printStudent() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Rank:" + rank );
   }
}