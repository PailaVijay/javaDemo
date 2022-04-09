package javaDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Date d= new Date();
      SimpleDateFormat sdf= new SimpleDateFormat("d/M/yyyy hh:mm:ss");
      System.out.println(sdf.format(d));
     System.out.println(d.toString());
      
	}

}
