package Cognisjavapractice;


class Table20
{
	void m1()
	{
		System.out.println("This is m1 method from Table20 class");
	}
}


interface Chair20
{
	void m2();
	
}

interface Flower
{
	void m3();
}



public class Hybridinheritance extends Table20 implements Chair20, Flower{
	
	public void m2()
	{
		System.out.println("this is m2 method from chair20 interface");
	}
	
	public void m3()
	{
	System.out.println("this is m3 method from Flower interface");
	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Hybridinheritance hi=new Hybridinheritance();
		hi.m1();
		hi.m2();
		hi.m3();
		
		
		
		
		

	}

}
