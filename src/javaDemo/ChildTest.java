package javaDemo;

public class ChildTest extends ParentTest{

	
	String name = "Bijaya";
	public ChildTest()
	{
		super();
		System.out.println("child class constructor");
	}
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildTest ch= new ChildTest();
		
		ch.getData();
		ch.getStringdata();
	}

}
