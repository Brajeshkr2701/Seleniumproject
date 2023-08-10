package Cognisjavapractice;


interface I1
{
	
	void show();
	
}

public class Interfaceexample3 implements I1 {
	public void show()
	{
		System.out.println("abc");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Interfaceexample3 ie3=new Interfaceexample3();
		ie3.show();
		

	}

}
