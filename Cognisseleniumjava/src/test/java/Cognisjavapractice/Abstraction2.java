package Cognisjavapractice;


abstract class Animal10
{
	void leg()
	{
		System.out.println("All Animals have 4 legs");
	}
	
	
	abstract void sound();
	
	abstract void eat();
}
	
	
	class Dog10 extends Animal10
	{
		
	void sound()
	{
		System.out.println("Bow Bow");
	}
	
	void eat()
	{
		System.out.println("Meat eating");	
	}
		
	}
		
		
	
	
	class cow10 extends Animal10
	{
		
		void sound()
		{
			System.out.println("Mow Mow");
		}
		
		void eat()
		{
			System.out.println("Grass eating");
		}
		
		
		
		
	}
	
	
	
	

	
	
	



public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog10 d=new Dog10();
		d.leg();
		d.sound();
		d.eat();
		
		
		cow10 co=new cow10();
		co.leg();
		co.sound();
		co.eat();
		
		
		

	}

}


