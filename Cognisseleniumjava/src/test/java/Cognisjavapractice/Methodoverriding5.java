package Cognisjavapractice;


class Wire
{
	
	 void show()
	{
		System.out.println("1");
	}
}


class brush extends Wire
{
	 void show()
	{
		System.out.println("2");
	}
}
	






public class Methodoverriding5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wire w=new Wire();
		w.show();
		
		brush b=new brush();
		b.show();

	}

}
