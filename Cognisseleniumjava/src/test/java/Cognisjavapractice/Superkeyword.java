package Cognisjavapractice;


 class Circle
{
	 String color="white";
	void draw()
	{
		System.out.println("cannot say shape type");
	}
}



 class square extends Circle
{
	
	 String color="Black";
	void draw()
	{
		
		System.out.println("square shape");
		super.draw();
		
	}
}

public class Superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		square s=new square();
		s.draw();
		
		
		
		

	}

}
