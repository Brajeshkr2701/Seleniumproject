package Cognisjavapractice;

public class Constructoroverloading2 {
	
	
	Constructoroverloading2(int a,int b)
	{
		
		System.out.println(a+b);
		
		
	}
	Constructoroverloading2(int a,double b)
	{
		
	System.out.println(a+b);	
		
		
	}
	Constructoroverloading2(double a,int b)
	{
		
		
		System.out.println(a+b);		
		
		
	}
	
	Constructoroverloading2(int a,int b,int c)
	{
		
		
		System.out.println(a+b+c);		
		
		
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		Constructoroverloading2 co1=new Constructoroverloading2(10,20);
		
		Constructoroverloading2 co2=new Constructoroverloading2(10,10.5);
		
		Constructoroverloading2 co3=new Constructoroverloading2(20.5,10);
		
		Constructoroverloading2 co4=new Constructoroverloading2(10,20,30);
		
		

	}

}
