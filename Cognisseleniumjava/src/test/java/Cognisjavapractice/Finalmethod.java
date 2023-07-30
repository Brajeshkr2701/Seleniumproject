package Cognisjavapractice;


class Red
{
	
	void mnnumber()
	{
		System.out.println("1234567891");
	}
	
	
	 final void atmpin()
	{
		System.out.println("12345678");
	}
	
}


class Thief extends Red
{
	
	
	void mnnumber()
	{
		System.out.println("1234567891");
	}
	
	
	//void atmpin()
	{
		System.out.println("12345678");
	}
	
	
	
}


public class Finalmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thief th=new Thief();
		
		th.mnnumber();
		th.atmpin();
		
		

	}

}
