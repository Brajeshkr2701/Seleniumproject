package Cognisjavapractice;

class School
{
	void input()
	{
		
		
		System.out.println("Enter your Name: ");
	}
}


class Student1 extends School
{
	
	void show()
	{
		
		
		
		System.out.println("My name is abc");
}
}
class Teacher extends School
{
	void Disp()
	{
		System.out.println("My name is xyz");
	}
}


public class Hierarchicalinheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1=new Student1();
		s1.input();
		s1.show();
		
		
		Teacher t=new Teacher();
		t.input();
		t.Disp();

	}

}
