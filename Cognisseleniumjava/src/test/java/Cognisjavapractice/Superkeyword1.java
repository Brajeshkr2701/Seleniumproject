package Cognisjavapractice;


class Sun 
{
	int a=10;
}

class Earth extends Sun
{
	int a=20;
	void show()
	{
		System.out.println(a);
		System.out.println(super.a);
		
	}
}


public class Superkeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Earth e=new Earth();
		e.show();

	}

}
