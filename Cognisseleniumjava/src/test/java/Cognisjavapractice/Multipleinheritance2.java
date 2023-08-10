package Cognisjavapractice;


interface Pen1

{
	 int x=100;//public ,static, final
	 void m1();//public ,abstract
}


interface pen2
{
	int y=200;
	void m2();
}



public class Multipleinheritance2 implements Pen1,pen2 {
	
	public void m1()
	{
		System.out.println(x);
	}
	
	
	public void m2()
	{
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multipleinheritance2 mi=new Multipleinheritance2();
		mi.m1();
		mi.m2();
		
		
		
		
		
	
		

	}

}
