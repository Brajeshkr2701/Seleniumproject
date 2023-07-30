package Cognisjavapractice;

public class Nonargumentandargumentconstructor {
	
	
	int x;
	int y;
	
	Nonargumentandargumentconstructor()
	{
		
	x=10;
	y=20;
		
	}
	
	Nonargumentandargumentconstructor(int a,int b)
	{
		
	x=a;
	y=b;
		
	}
	
	
	void display()
	{
		
		
		System.out.println(x+y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Nonargumentandargumentconstructor nacc=new Nonargumentandargumentconstructor();		
		
		nacc.display();
		
		
		Nonargumentandargumentconstructor nac=new Nonargumentandargumentconstructor(100,200);
		
		nac.display();	
		
		
		
		
		
		

	}

}
