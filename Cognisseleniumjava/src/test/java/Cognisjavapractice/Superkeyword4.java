package Cognisjavapractice;


class Mercury
{
	Mercury(int a)
	{
		System.out.println("Hello viewer"+a);
	}
}



class Uranus extends Mercury
{
	Uranus()
	{
		
		super(100);
		System.out.println("Hello Learner");
	}
}

public class Superkeyword4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uranus u=new Uranus();
		

	}

}
