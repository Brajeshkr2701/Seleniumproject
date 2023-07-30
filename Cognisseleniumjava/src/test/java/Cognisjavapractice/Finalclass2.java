package Cognisjavapractice;


 final class Train2
{
	void run()
	{
	System.out.println("Train is running");
	}
}

class Aeroplane2 extends Train2
{
	void run()
	{
		System.out.println("Aeroplane2 is flying");
	}
}

public class Finalclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Aeroplane2 a2=new Aeroplane2();
		a2.run();
	}

}
