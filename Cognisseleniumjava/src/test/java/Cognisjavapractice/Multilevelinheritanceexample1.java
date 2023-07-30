package Cognisjavapractice;


class Table1
{
	
	void showA()
	{
		
		System.out.println("a class method");
	}
}


class Table2 extends Table1
{
	
	void showB()
	{
		
		
		System.out.println("b class method");
	}
	
	
}


class Table3 extends Table2
{
	void showC()
	{
		
		
		System.out.println("c class method");
	}
}


public class Multilevelinheritanceexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Table1 t1=new Table1();
		t1.showA();
		
		
		Table2 t2=new Table2();
		t2.showA();
		t2.showB();
		
		
		Table3 t3=new Table3();
		t3.showA();
		t3.showB();
		t3.showC();
		
		
		
		
		
		
		
		
		

	}

}
