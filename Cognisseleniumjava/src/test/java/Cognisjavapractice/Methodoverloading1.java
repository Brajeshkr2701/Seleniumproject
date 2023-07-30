package Cognisjavapractice;

public class Methodoverloading1 {
	
	
	void show(int a,int b)
	{
		System.out.println("This is abc");
	}
	
	
	void show(int a)
	{
		System.out.println("This is def");	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Methodoverloading1 m1=new Methodoverloading1();
		m1.show(10,20);
		
		m1.show(10);
		

	}

}
