package collectionPractice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Mukesh");
		alist.add("Khedkar");
		System.out.println(alist);
		alist.add(1, "A");
		System.out.println(alist);
		
		ArrayList<Integer> aInt=new ArrayList<Integer>();
		aInt.add(2);
		aInt.add(3);
		System.out.println(aInt);
		
		for(String str:alist)
		{
			System.out.println(str);
		}
		System.out.println(alist.size());

	}

}
