package Cognisjavapractice;

public class Studentsssss {
	
	int sid;
	String sname;
	char grade;
	
	
	
	
	void Blue(int id,String name,char g)
	{
		
		sid=id;
		sname=name;
		grade=g;
	}
		
		
	void display()
	{
		
		
		
	System.out.println(sid+" "+sname+" "+grade);	
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Studentsssss stu=new Studentsssss();
		stu.Blue(200, "qwer", 'A');
		stu.display();
		
		
		
		
		
		
		
		
		

	}

}
