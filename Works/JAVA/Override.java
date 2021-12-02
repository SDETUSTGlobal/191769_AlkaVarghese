class Bank{

void show()
{
System.out.println("this is my bank");
}
}

class Hdfc extends Bank{

void show()
{
System.out.println("this is HDFC bank");
}
}

class Sbi extends Bank{

void show()
{
System.out.println("this is SBI bank");
}
}

class Axis extends Bank{

void show()
{
System.out.println("this is axis bank");
}
}


class Override{

public static void main(String args[])
{
Hdfc h = new Hdfc();
Sbi s = new Sbi();
Axis a = new Axis();

h.show();
s.show();
a.show();


}
}