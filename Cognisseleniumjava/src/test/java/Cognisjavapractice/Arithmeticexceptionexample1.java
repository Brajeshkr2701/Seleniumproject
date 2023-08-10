package Cognisjavapractice;

public class Arithmeticexceptionexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Proram is started");		
System.out.println("Proram is in progress");

int a=100;


try 
{
System.out.println(a/2);
}


catch(ArithmeticException e)
{
	System.out.println("Entered in to catch block");
}

System.out.println("Proram is completed");
System.out.println("Proram is executed");


		
		

	}

}
