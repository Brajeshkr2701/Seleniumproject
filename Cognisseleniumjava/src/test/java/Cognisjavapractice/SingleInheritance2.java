package Cognisjavapractice;


class singleInheritance1
{
	
	void showA()
	{
		
		System.out.println("a class method");
		
	}
}



public class SingleInheritance2 extends singleInheritance1{
	
	
void showB()
{
	
	System.out.println("b class method");	
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		singleInheritance1 si=new singleInheritance1();
		si.showA();
		
		
		SingleInheritance2 si2=new SingleInheritance2();
		si2.showA();	
		si2.showB();
		
		

	}

}
