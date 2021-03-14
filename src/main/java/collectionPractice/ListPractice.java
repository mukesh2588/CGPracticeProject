package collectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		
		List<String> ll= new ArrayList<String>();
		
		ll.add("Mukesh");
		ll.add("Khedkar");
		
		for (int i = 0; i < ll.size(); i++)
		{
			System.out.println(ll.get(i));
			
		}
		for(String str:ll)
		{
			System.out.println(str);
		}
		
				

	}

}
