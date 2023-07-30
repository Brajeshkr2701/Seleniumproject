package Cognisjavapractice;

public class Employee {
	
	
	
	
	
	    //Variable	
			int eid;
			String ename;
			double sal;
			int deptno;
			String job;
			
			
			//Methods
			
			void display()
			
			{
				
				System.out.println(eid);
				System.out.println(ename);
				System.out.println(sal);
				System.out.println(deptno);
				System.out.println(job);
				
			}
			
			
		
			
			
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee emp1=new Employee();
		emp1.eid=105;
		emp1.ename="abcd";
		emp1.sal=40000.00;
		emp1.deptno=15;
		emp1.job="asddf";
		emp1.display();
		
		
		
		
		Employee emp2=new Employee();	
		emp2.eid=106;
		emp2.ename="qwer";
		emp2.sal=45000.00;
		emp2.deptno=16;
		emp2.job="ghjk";
		emp2.display();
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

	}

}
