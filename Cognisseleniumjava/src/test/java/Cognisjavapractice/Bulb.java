package Cognisjavapractice;

public class Bulb {
	
	public void m1()
	{
		
		System.out.println("m1 without arg");
	}
	
	public int m1(int x) {
		
		System.out.println("m1 with int arg");
		return 123;
		
	}
	
	public String m1(String s)
	{
		System.out.println("m1 with string arg");
		return "hello";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bulb b=new Bulb();
	     b.m1();
	    b.m1(123);
		b.m1("hello");
		
		  int m1=b.m1(123);
		            
		  System.out.println(m1);
		
		
		
		

	}

}
