package Cognisjavapractice;

public class Thiskeyword5 {
	
	void m1(Thiskeyword5 td)
	{
		System.out.println("This is td");
	}
	
	
	void m2()
	{
		m1(this);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thiskeyword5 th=new Thiskeyword5();
		th.m2();

	}

}
