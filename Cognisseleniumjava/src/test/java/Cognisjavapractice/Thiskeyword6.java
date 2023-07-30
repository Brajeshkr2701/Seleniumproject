package Cognisjavapractice;







class Truck
{
	Truck(Thiskeyword6 td)
	{
		System.out.println("test class constructor");
	}
}


public class Thiskeyword6 {
	
	void m1()
	{
		Truck t=new Truck(this);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thiskeyword6 th=new Thiskeyword6();
		
		th.m1();
		

	}

}
