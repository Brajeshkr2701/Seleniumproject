package Cognisjavapractice;

public class Finallyblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Program Started");
		int a=100;
		try
		{
			System.out.println(a/0);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Entered in to catch block");
		}
		finally
		{
			System.out.println("Enterred in to finally block");
		}
		System.out.println("Program executed");
	}
	


	}


