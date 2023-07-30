package Cognisjavapractice;


interface HeroHonda1
{
	void show();
}



interface HeroHonda2
{
	void show();
}

class Scooter implements HeroHonda1,HeroHonda2{
	
public	void show()
	{
		System.out.println("Interface A & B");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scooter s=new Scooter();
		s.show();

	}

}
