package Cognisjavapractice;

public class Student {
	
//Variable	
int sid;
String sname;
char grade;


//Methods

void display()
{
	
	System.out.println(sid+" "+sname+" "+grade);    
	
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu=new Student();
		
		stu.sid=100;
		stu.sname="abcd";
		stu.grade='A';
		stu.display();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
