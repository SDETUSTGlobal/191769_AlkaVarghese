/*3) Static keyword and static method program for student calss with 500 records. display their college name , roll number and Name.
*/
class Stud500{
	static String ClgName="MITS";
	 String name="ALKA";
	 int rollno= 8;
	public static void main(String args[]){
		display();
		Stud500 t1 = new Stud500();
		t1.show();
	//for(int i=1;i<=500;i++)
	
	}
	static void display()
	{
		System.out.println(Stud500.ClgName);
		//System.out.println(Stud500.name);
		//System.out.println(Stud500.rollno);
	}
	void show()
	{
		System.out.println("Name:"+ name);
		System.out.println("rollno:"+ rollno);
	
	}
}