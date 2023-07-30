package Cognisjavapractice;

public class Nonargumentconstructor2 {
	
int x;
int y;

Nonargumentconstructor2()
{
	
	x=10;
	y=20;
	
	
}
  void display()
       {
    	   
    	   
    	System.out.println(x+y);   
    	   
       }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Nonargumentconstructor2 nac2=new Nonargumentconstructor2();
		
		nac2.display();
		
		

	}

}
