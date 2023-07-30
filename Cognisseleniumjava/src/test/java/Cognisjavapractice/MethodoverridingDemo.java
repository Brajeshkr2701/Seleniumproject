package Cognisjavapractice;


class RBIBank
{
	
double rateofinterest()
{
	return 0;
}
}


class SBI extends RBIBank
{
	double rateofinterest()
	{
		
		return 10.5;
	}
}


class ICICI extends RBIBank
{
	double rateofinterest()
	{
		return 9.7;
	}
}


class AXIS extends RBIBank
{
	double rateofinterest()
	{
		return 8.5;
	}
}


public class MethodoverridingDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI s=new SBI();
		System.out.println(s.rateofinterest());
		
		ICICI i=new ICICI();
		
		System.out.println(i.rateofinterest());
		
		AXIS a=new AXIS();
		
		System.out.println(a.rateofinterest());
		
		
		
		

	}

}
