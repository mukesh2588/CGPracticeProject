package collectionPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice2 {

	public static void main(String[] args) {
		ArrayList<String> arrlst=new ArrayList<>();
		arrlst.add("Mukesh");
		arrlst.add("TestClass");
		arrlst.add("khedkar");
		// Displaying the list 
        System.out.println("The list is: \n"+ arrlst);
		
		Iterator<String> iter=arrlst.iterator();
		 // Displaying the values after iterating 
        // through the list 
        System.out.println("\nThe iterator values"
                           + " of list are: "); 
        while (iter.hasNext()) { 
            System.out.print(iter.next() + " "); 
        } 
        
        ArrayList<Integer> arrlstInt=new ArrayList<>();
        arrlstInt.add(50);
        arrlstInt.add(22);
        arrlstInt.add(50);
        arrlstInt.add(27);
        
        System.out.println("\nThe Integer list is: \n"+ arrlstInt);
        Iterator<Integer> itrInt=arrlstInt.iterator();
        System.out.println("\nThe iterator values" + " of list are: ");
        while(itrInt.hasNext())
        {
        	System.out.println(itrInt.next());
        }
		

	}

}
