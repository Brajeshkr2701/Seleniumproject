package Cognisjavapractice;


class Mars
{
	void show()
	{
		System.out.println("Hello India");
	}
}

class Jupiter extends Mars
{
	
	void show()
	{
		super.show();
		System.out.println("Hello World");
	}
}


public class Superkeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jupiter j=new Jupiter();
		j.show();

	}

}
