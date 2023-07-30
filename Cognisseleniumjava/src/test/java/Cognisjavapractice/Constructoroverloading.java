package Cognisjavapractice;

public class Constructoroverloading {
	
	
	Constructoroverloading(int x)
	{
		
		System.out.println("constructor with int");
		
	}
	
	Constructoroverloading(String y)
	{
		
		System.out.println("constructor with String");	
		
		
	}
	
	Constructoroverloading(int a,int b)
	{
		
		
		
		System.out.println("constructor with 2 int");		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Constructoroverloading co1=new Constructoroverloading(10);
		
		Constructoroverloading co2=new Constructoroverloading("Hello");
		
		Constructoroverloading co3=new Constructoroverloading(10,20);
		
		
		

	}

}
