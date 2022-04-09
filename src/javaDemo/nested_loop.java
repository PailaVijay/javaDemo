package javaDemo;

public class nested_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int rows = 5;

	    for (int i = 1; i <= rows; ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
	    }  */
	/*int k=1;
	for (int i=0; i<4; i++ )
	{
		//System.out.println("outer loop started");
		for(int j=1; j<=4-i; j++)
		{
		System.out.print(k);
	    System.out.print("\t");
		k++;
	}
	
	System.out.println("");
	}  */
		
		
	/*	int weeks = 3;
	    int days = 7;

	    // outer loop prints weeks
	    for (int i = 1; i <= weeks; ++i) {
	      System.out.println("Week: " + i);

	      // inner loop prints days
	      for (int j = 1; j <= days; ++j) {
	        System.out.println("  Day: " + j);
	      }
	    }  */
	/*
		int k=1;
		for (int i=0; i<4; i++)
		{
			//System.out.println("outer loop started");
			for(int j=0; j<=i; j++)
			{
			System.out.print(k);
		    System.out.print("\t");
			k++;
		}
		
		System.out.println("");
		}  */
		
		for(int i=1; i<4;i++)
		{
			for(int j=3; j<i*3;j++)
			{
			System.out.print(i+ " "); 
			
			}
		
	    System.out.println();
		}
		
		
	}

}
