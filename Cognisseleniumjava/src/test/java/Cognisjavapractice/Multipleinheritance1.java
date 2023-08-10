package Cognisjavapractice;

interface Mobile1
{
	void show();
	
}


interface Mobile2
{
void Disp();


}


public class Multipleinheritance1 implements Mobile1, Mobile2 {
	
	public void show()
	{
		System.out.println("Interface A ");
	}
	
	
	public void Disp()
	{
		System.out.println("Interface B");
	}

	public static void main(String[] args) {
		
		Multipleinheritance1 mi=new Multipleinheritance1();
		mi.show();
		mi.Disp();

	}

}
