package Cognisjavapractice;



interface customerABC
{
	int amt=5;//public,staic,final
	void purchase();//public,abstract
}




class sellerDEF implements customerABC
{
	public void purchase()
	{
		//amt=7;
		System.out.println("DEF needs "+amt+"kg rice");
	}
}

public class Interfaceexample4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sellerDEF sd=new sellerDEF();
		sd.purchase();
		
	System.out.println(customerABC.amt);
		
		
		

	}

}
