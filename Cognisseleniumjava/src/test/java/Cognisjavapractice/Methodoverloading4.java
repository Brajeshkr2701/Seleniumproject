package Cognisjavapractice;

public class Methodoverloading4 {
	
	
	
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	
	void add(int a,double b)
	{
		
		System.out.println(a+b);	
	}
	
	
	void add(double a,double b)
	{
		System.out.println(a+b);	
	}
	
	
	void add(int a,int b,int c)
	{
		
		System.out.println(a+b+c);		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverloading4 m4=new Methodoverloading4();
		m4.add(10,20);
		m4.add(10, 20, 30);
		m4.add(10, 20.5);
		m4.add(10.5, 10.0);
		

	}

}
