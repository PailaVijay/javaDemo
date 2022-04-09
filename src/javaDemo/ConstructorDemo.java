package javaDemo;

public class ConstructorDemo {
	
	private static final char[] String = null;
	public ConstructorDemo()
	{
		System.out.println("i am learning java");
	}
	
    public ConstructorDemo(int a, int b)
    {
    	int sum=a+b;
    	System.out.println(sum);
    }
    public ConstructorDemo(String s)
    {
    	//String s1= ();
    	System.out.println(s);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ConstructorDemo cd= new ConstructorDemo();
       ConstructorDemo d= new ConstructorDemo(7,5);
       ConstructorDemo s= new ConstructorDemo("Believe in yourself");
	}

}
