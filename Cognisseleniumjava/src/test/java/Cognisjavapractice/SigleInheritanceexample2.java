package Cognisjavapractice;


class Box1
{
	int a;
	void display()
	{
		
		System.out.println(a);
	}
}


class Box2 extends Box1
{
	int b;
	void Print()
	{
		System.out.println(b);
	}
}



public class SigleInheritanceexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Box1 aobj=new Box1();	
	aobj.a=100;
	aobj.display();
	
	Box2 bobj=new Box2();
	bobj.a=10;
	bobj.b=20;
	bobj.display();
	bobj.Print();
	
	
		
		
		
		

	}

}
