package javaDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs= new HashSet<String>();
		hs.add("india");
		hs.add("pakistan");
		
		//System.out.println(hs.add("india"));
		hs.add("USA");
		hs.add("japan");
		hs.add("UK");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		  
		Iterator<String> it= hs.iterator();
		//System.out.println(it.next());
		//System.out.println(it.next());
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
