package Cognisjavapractice;

public class Studentts {
	
	int sid;
	String sname;
	char grade;
	
	public Studentts(int id,String name,char g)
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
		
		
		
		Studentts stu=new Studentts(100,"qwer",'A');
		stu.display();
		
		

		
		
		
		
		
		
		

	}

}
