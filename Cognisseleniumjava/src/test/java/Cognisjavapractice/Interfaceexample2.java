package Cognisjavapractice;


interface vehicle26
{
	
	int a=10;
	void m1();
	
	
}

public class Interfaceexample2 implements vehicle26 {
	
	
	public void m1()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interfaceexample2 ie2=new Interfaceexample2();
		
		ie2.m1();
		

	}

}
