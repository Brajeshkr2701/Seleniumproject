package Cognisjavapractice;

public class Staticexample3 {
	
	
	static int a=10;
	
	int b=20;
	
	
	 static void m1()
	
	{
		
	System.out.println("this is m1-static method");	
		
	}
	
	 
	 void m2()
	 {
		 
		 
		 System.out.println("this is m2-non-static method");
	 }
	 
	 void m3()
	 {
		 
	System.out.println(a);	 //static variable
	System.out.println(b);//Non-static variable	
	m1();//Static method
	m2();//Non-static method
 
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Staticexample3 se1=new Staticexample3();
		se1.m3();
		
		
		

	}

}
