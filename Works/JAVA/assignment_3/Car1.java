/*2)Create diffrent interfaces
a- provide examples of multiple inheritance
b- Interface inheritance
c-static method and default method in interface.*/

//b- Interface inheritance

interface Mahindra{
	void model();
}
interface Hyundai extends Mahindra{
	void name();
}
class Car1 implements Hyundai{
	public void model()
	{
		System.out.println("car is Mahindra XUV500");
	}
	public void name()
	{
		System.out.println("Car is i20");
	}
	public static void main(String args[]){
		Car1 obj = new Car1();
		obj.model();
		obj.name();
	}
}
