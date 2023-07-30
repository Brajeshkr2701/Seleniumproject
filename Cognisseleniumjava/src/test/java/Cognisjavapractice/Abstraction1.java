package Cognisjavapractice;


abstract class Vehicle10
{
	abstract void start();
	
		
}
class Bmw extends Vehicle10
{

	void start()
	{
		System.out.println("Bmw car starts with key");
	}
	
}


class Ktm extends Vehicle10
{
	
	void start()
	{
		System.out.println("Ktm Bike starts with kick");
	}
	
	
}

public class Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Bmw Bm=new Bmw();
		
		Bm.start();
		
		Ktm kt=new Ktm();
		kt.start();
		
		
		
		
		
		

	}

}
