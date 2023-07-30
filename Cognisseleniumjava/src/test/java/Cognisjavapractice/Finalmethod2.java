package Cognisjavapractice;


class Train
{
final void run()
	{
		System.out.println("Train is running");
	}
}


class Aeroplane extends Train
{
	//void run()
	{
		System.out.println("Aeroplane is flying");
	}
}


public class Finalmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aeroplane ap=new Aeroplane();
		ap.run();
		

	}

}
