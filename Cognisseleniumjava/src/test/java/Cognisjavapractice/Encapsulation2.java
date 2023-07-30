package Cognisjavapractice;


class Employee1
{
	private int empid;
	
	//Setter method
	public void setEmpid(int eid)
	{
		empid=eid;
	}
	
	
	//Getter method
	public int getEmpid()
	{
		return empid;
	}
}

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee1 e1=new Employee1();
		e1.setEmpid(101);
		System.out.println(e1.getEmpid());
		

	}

}
