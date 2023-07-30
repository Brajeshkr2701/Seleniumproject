package Cognisjavapractice;


class C
{
	int a;
	void display()
	{
		
		System.out.println(a);
	}
}


class D extends C
{
	int b;
	void Print()
	{
		System.out.println(b);
	}
}


public class SigleInheritanceexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		C aobj=new C();	
		aobj.a=100;
		aobj.display();
		
		D bobj=new D();
		bobj.a=10;
		bobj.b=20;
		bobj.display();
		bobj.Print();
		
		

	}

}
