package Cognisjavapractice;

public class Argumentconstructor2 {
	
	
	int x;
	int y;
	
	
	Argumentconstructor2(int a,int b)
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
		
		
		
		
		Argumentconstructor2 ac2=new Argumentconstructor2(100,200);	
		ac2.display();

	}

}
