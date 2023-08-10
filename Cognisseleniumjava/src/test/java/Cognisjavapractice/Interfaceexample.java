package Cognisjavapractice;


interface Vehicle25
{
	String Name="TVS";//Public,Static and Final
	int speed=100;//public,Static and Final
	
	
	void start();//Public,abstract
	void stop();//Public abstract
}



 class Interfaceexample implements Vehicle25 {
	
	
	
	
	
	
	public void start()
	{
	  
		System.out.println("start():insert key & press start button" +Name);
	}
	
	
	public void stop()
	{
		System.out.println("stop():exit key");
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interfaceexample ie=new Interfaceexample();
		
		ie.start();
		ie.stop();
		
		System.out.println(speed);
		

	}

}
