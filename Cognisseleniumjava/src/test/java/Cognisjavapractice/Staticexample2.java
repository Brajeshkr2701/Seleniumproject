package Cognisjavapractice;

public class Staticexample2 {
	
	
	static int a=10;//static variable
	int b=20;//non-static variable
	
	
	
	
	static  void m1()//static method
	{
		
	System.out.println("this is m1-Static method");	
		
		
	}
	
	void m2()//non-static method
	{
		
		
	System.out.println("this is m2-non-static method");	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		m1();
		
		Staticexample2 se=new Staticexample2();
		
	
		  System.out.println(se.b);
		  
		  se.m2();
		  
		
		
		
		
		
		
		
		

	}

}
