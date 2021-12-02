/*5)Provide examples of checked and unchecked unexceptions and user defined exceptions using folliwng items: 
arrays call by value call by refrence 
wrapper class
recursive*/
// recursion
public class Recursion{
	
	static void fact()
	{ 
			//System.out.println("Recursion program \n");	
            fact();			
	}
	public static void main(String args[]){
		try{
			fact();
		}
		catch(StackOverflowError e)
		{
			System.out.println(e);
		}
           System.out.println("invalid \n");
	}
}