package Cognisjavapractice;

public class Complimentaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int x=10;
int y=9;

System.out.println(x++ > --y);//True
                  //10   //8
System.out.println(--x!=++y);//True
                  //10    //9
System.out.println(x++ ==y++);//False
                  //10   //9
System.out.println(x);//11
System.out.println(y);//10
		
		
		
		
		
		
		

	}

}
