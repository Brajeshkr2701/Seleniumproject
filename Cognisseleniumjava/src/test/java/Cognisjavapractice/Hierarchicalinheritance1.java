package Cognisjavapractice;


class Bat

{
	
void showA()
{
	System.out.println("a class method");
}
	
	
}



class Ball extends Bat
{
	
	
	
	void showB()
	{
		System.out.println("b class method");
	}
}

class wicket extends Bat
{
	
	void showc()
	{
		System.out.println(" c class method");
	}
	
}



public class Hierarchicalinheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bat b=new Bat();
		b.showA();
		Ball b1=new Ball();
		b1.showA();
		b1.showB();
		
		wicket w=new wicket();
		w.showA();
		w.showc();
		

	}

}
