package collectionPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Mukesh");
		ll.add("Khedkar");
		
		for (Iterator iterator = ll.iterator(); iterator.hasNext();) 
		{
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		for (int i = 0; i < ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}

	}

}
