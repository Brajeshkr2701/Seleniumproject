package Cognisjavapractice;

public class Thiskeyword3 {
	
	Thiskeyword3()
	{
		System.out.println("This is Laptop");
	}
	
	
	
	Thiskeyword3(int a)
	{
		this();
		System.out.println("This is Desktop");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thiskeyword3 th=new Thiskeyword3(10);

	}

}
