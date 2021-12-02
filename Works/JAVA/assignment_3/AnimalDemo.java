/*2)Create diffrent interfaces
a- provide examples of multiple inheritance
b- Interface inheritance
c-static method and default method in interface.*/

//a- provide examples of multiple inheritance

interface Dog{
	void sleep();
}
interface Cat{
	void eat();
}
class Animal implements Dog, Cat{
	public void sleep()
	{
		System.out.println("Dog is sleeping");
	}
	public void eat()
	{
		System.out.println("Cat is eating");
	}
}
class AnimalDemo{
	public static void main(String args[]){
		Animal obj = new Animal();
		obj.sleep();
		obj.eat();
	}
	
	
}