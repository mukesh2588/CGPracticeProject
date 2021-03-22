//Using Character Array
package stingProgs;

public class ReverseString {

	public static void main(String[] args) 
	{
		String sample= "Mukesh";
		
		char [] chaArr=sample.toCharArray();
		
		int lenghOfChArr=chaArr.length;
		String revSample="";
		for (int i = lenghOfChArr-1; i >=0; i--) 
		{
			revSample=revSample+chaArr[i];
		}
		System.out.println(revSample);

	}

}
