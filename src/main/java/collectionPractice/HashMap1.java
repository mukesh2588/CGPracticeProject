package collectionPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(2, "Mukesh");
		hm.put(3, "Khedkar");
		hm.put(2, "Test");
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		
		for(Map.Entry<Integer, String> e:hm.entrySet())
		{
			System.out.println(e.getKey()+" " +e.getValue());
		}
		

	}

}
