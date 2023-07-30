package Cognisjavapractice;

public class Methodoverloading3 {
	
	
	void show(int a)
	{
		
	System.out.println("This is ghj");	
		
	}
	
	void show(String b)
	{
		System.out.println("This is tyu");	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverloading3 m3=new Methodoverloading3();
		m3.show(10);
		m3.show("abc");
		

	}

}
