package Cognisjavapractice;


public class Thiskeyword {
	
int a,b;//Class variable//Instance variable

void Earth(int a,int b)//Method variable
{
	
	this.a=a;
	this.b=b;
	
}

void Mars()
{
	
	System.out.println(a);
	System.out.println(b);
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thiskeyword th=new Thiskeyword();
		th.Earth(10,20);
		th.Mars();
		

	}

}
