package javaDemo;

public class ChildC extends ParentA {

	String name= "Bijaya Kumar Reddy";
	int e= 15;
	public void getStringData()
	{
		int e= 25;
		int b= e+this.e;
		System.out.println(e);
		System.out.println(this.e);
		System.out.println(name);
		System.out.println(super.name);
		System.out.println(b);
	}
	public ChildC()
	{
		
		super();
		//System.out.println("i am child class constructor");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChildC c= new ChildC();
     
     c.getStringData();
     
	}
	

}
