package javaDemo;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[][]= new int[2][3];
     a[0][0]=2;
     a[0][1]=4;
     a[0][2]=5;
     a[1][0]=3;
     a[1][1]=4;
     a[1][2]=7;
     		 
    /* for(int i=0;i<2;i++) {
    	 for (int j=0;j<3;j++)
    	 {
    		 System.out.print(a[i] [j]+" ");
    		 //System.out.print("\t");
    	 }*/
   /*  int b[][] = { {2,4,5},{3,4,7}};
     for (int i=0;i<2;i++)
     {
    	 for (int j=0;j<3;j++)
    	 {
    		 System.out.print(b[i][j]+" ");
    	 }
    	 System.out.println();
     }*/
           	 
      /*  int c[][]= {{2,4,5},{3,4,7},{1,2,9}};
        int min=c[0][0];
    	 for (int i=0;i<3;i++)
    	 {
    		 for(int j=0;j<3;j++)
    		 {
    			if(c[i][j]<min)
    			{
    				min=c[i][j];
    			}
    			 
    		 }
    		 
    	 }
    	 System.out.println(min);  */
     int d[][]={{2,4,5},{3,4,7},{1,2,9}};
     int max=d[0][0];
     for(int i=0;i<3;i++)
     {
    	 for(int j=0;j<3;j++)
    	 {
    		 if(d[i][j]>max)
    		 {
    			 max=d[i][j];
    		 }
    	 }
     }
     System.out.println(max);
	}

}
