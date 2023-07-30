package Cognisjavapractice;


interface keyboard3
{
	void show();
}

interface keyboard4
{
	void Disp();
}


class Vehicle2 implements keyboard3,keyboard4{
	
	
	public void show()
	{
		System.out.println("abc");
	}
	
	public void Disp()
	{
		System.out.println("def");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle2 v2=new Vehicle2();
		v2.show();
		v2.Disp();

	}

}
