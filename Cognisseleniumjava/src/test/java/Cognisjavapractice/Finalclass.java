package Cognisjavapractice;

final class Red2
{
	void mnnumber()
	{
		System.out.println("1234567891");
	}
	
	
	void atmpin()
	{
		System.out.println("12345678");
	}
}

    class Thief2 extends Red2
{
	
	void mnnumber()
	{
		System.out.println("1234567891");
	}
	
	
	void atmpin()
	{
		System.out.println("12345678");
	}
	
	
}

public class Finalclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thief2 th2=new Thief2();
		th2.mnnumber();
		th2.atmpin();

	}

}
