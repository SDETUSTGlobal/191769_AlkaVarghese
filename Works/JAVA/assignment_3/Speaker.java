/*2)Create diffrent interfaces
a- provide examples of multiple inheritance
b- Interface inheritance
c-static method and default method in interface.*/

//c-static method and default method in interface

interface Computer
{
	default void comp()
	{
		System.out.println("computer .. computer..");
	}
	static void keyboard()
	{
		System.out.println("keyboard .. keyboard..");
	}
} 
class Speaker implements Computer{
	
	public static void main(String args[])
	{
		Speaker s= new Speaker();
		s.comp();
		Computer.keyboard();
	}
}