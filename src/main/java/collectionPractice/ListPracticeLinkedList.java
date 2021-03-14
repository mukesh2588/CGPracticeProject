package collectionPractice;

import java.util.LinkedList;
import java.util.List;

public class ListPracticeLinkedList {

	public static void main(String[] args) {
		
		List<String> ll= new LinkedList<String>();
		ll.add("Mukesh");
		ll.add("Khedkar");
		
		for (String string : ll) 
		{
			System.out.println(string);
		}
		

	}

}
