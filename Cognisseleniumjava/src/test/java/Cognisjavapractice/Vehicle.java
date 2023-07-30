package Cognisjavapractice;







interface keyboard1
{
	void show();
}


interface keyboard2
{
	void show();
}

 class Vehicle implements keyboard1,keyboard2 {
	
	public void show()
	{
		System.out.println("abc");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle();
		v.show();
		

	}

}
