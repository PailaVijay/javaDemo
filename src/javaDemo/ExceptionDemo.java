package javaDemo;

public class ExceptionDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=12;
		int j= 0;
		
		try
		{
			//int a= i/j;
			//System.out.println(a);
			int a[]=new int[5];
			
				System.out.println(a[7]);
			
		}
		catch(ArithmeticException at)
		{
			System.out.println("i catch the arithmetic error");
		}
		
		catch(Exception e)
		{
		    System.out.println("i catched the error");
			
		}
		finally
		{
			System.out.println("delet cookies");
		}
	}

}
