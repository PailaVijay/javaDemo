package javaDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	private static final String MapEntry = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "Happy");
		hm.put(2, "Enjoy");
		hm.put(3, "Joy");
		hm.put(4, "Good Mood");
		hm.put(5, "Not bad");
		hm.put(6, "Satisfy");
		hm.put(7, "wishes");
		System.out.println(hm);
		System.out.println(hm.containsKey(1));
		System.out.println(hm.remove(5));
		System.out.println(hm);
		//System.out.println(hm.entrySet());
		System.out.println (hm.size());
		Set<Entry<Integer, String>> e=hm.entrySet();
		Iterator<Entry<Integer, String>> i=e.iterator();
		
		while (i.hasNext())
				{
			
			  Entry<Integer, String> mp= i.next();
			  System.out.println(mp.getKey());
			  System.out.println(mp.getValue());
			 
				}
		
	}

}
