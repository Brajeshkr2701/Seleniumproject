package Cognisjavapractice;

public class Methodoverloading2 {
	
	void show(int a,String b)
	{
		
		
		System.out.println(" This is abc");
	}
	
	
	void show (String b,int a)
	{
		System.out.println(" This is def");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverloading2 m2=new Methodoverloading2();
		m2.show("dfg", 10);
		m2.show(20, "qwe");

	}

}
