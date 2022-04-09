package javaDemo;

import java.util.ArrayList;

public class CollectonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(12);
		a.add(13);
		a.add(12);
		System.out.println(a);
		a.add(0, 15);
		System.out.println(a);
		System.out.println(a.contains(12));
		System.out.println(a.indexOf(13));
		System.out.println(a.get(2));
		//a.remove(2);
		//System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	
		
		
		

	}

}
