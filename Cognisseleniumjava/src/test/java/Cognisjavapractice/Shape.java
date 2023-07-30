package Cognisjavapractice;

public class Shape {
	
	
	public void m1()
	{
		System.out.println("m1 without argument");
	}
	
	
	public void m1(int x)
	{
		System.out.println("m1 with int argument");
	}
	
	public void m1(String s)
	{
		System.out.println("m1 with string  argument");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s=new Shape();
		s.m1();
		s.m1(123);
		s.m1("hello");
		

	}

}
