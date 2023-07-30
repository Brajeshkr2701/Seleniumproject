package Cognisjavapractice;


class Bike1
{
	
	int a;
	int b;
	int c;
	
	void add()
	{
		
	a=10;
	b=20;
	c=a+b;
	System.out.println("Sum of two mumbers: "+c);
		
	}
	
	void sub()
	{
		a=200;
		b=100;
		c=a-b;
		System.out.println("Sub of two mumbers: "+c);
		
		
	}
	
	
	
}

class Bike2 extends Bike1
{
	void multi()
	{
		a=10;
		b=20;
		c=a*b;
		System.out.println("Multiplication of two mumbers: "+c);
	}
	
	void div()
	{
		a=10;
		b=2;
		c=a/b;
		System.out.println("Division of two mumbers: "+c);
	}
	
}

class Bike3 extends Bike2
{
	
	void rem()
	{
		
		a=10;
		b=3;
		c=a%b;
		System.out.println("Remainder of two mumbers: "+c);
		
	}
	
}


public class Multilevelinheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bike1 b1=new Bike1();
		b1.add();
		b1.sub();
		
		Bike2 b2=new Bike2();
		b2.add();
		b2.sub();
		b2.multi();
		b2.div();
		Bike3 b3=new Bike3();
		b3.add();
		b3.sub();
		b3.multi();
		b3.div();
		b3.rem();

	}

}
