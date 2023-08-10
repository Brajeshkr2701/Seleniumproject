package Cognisjavapractice;

public class Exceptionhandling20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Program is started");		



int a=100;

try
	{
	System.out.println(a/0);	
	}

catch(ArithmeticException  e)
{
	System.out.println("Entered in to catch block");
}
finally
{
	System.out.println("Entered in to finally block");
}


System.out.println("Program is executed");
		
		

	}

}
