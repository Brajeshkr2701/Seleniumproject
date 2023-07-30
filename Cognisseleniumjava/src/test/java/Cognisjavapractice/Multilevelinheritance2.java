package Cognisjavapractice;

class Book1
{
	
	int a;
	void display()
	{
		System.out.println(a);
	}
	
}

class Book2 extends Book1
{
	
int b;
void print()
{
	System.out.println(b);
}
	
	
	
}

class Book3 extends Book2
{
	int c;
	void show()
	{
		System.out.println(c);
	}
}


public class Multilevelinheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book1 b1=new Book1();
		b1.a=100;
		b1.display();
		
		Book2 b2=new Book2();
		b2.a=10;
		b2.b=20;
		b2.display();
		b2.print();
		
		Book3 b3=new Book3();
		b3.a=100;
		b3.b=200;
		b3.c=300;
		b3.display();
		b3.print();
		b3.show();
		
		
		
		
		

	}

}
