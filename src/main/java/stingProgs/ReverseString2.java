//Using String Function
package stingProgs;

public class ReverseString2 {

	public static void main(String[] args) 
	{
		String sample= "Mukesh";
		int lengthOfSting= sample.length();
		String revSample="";
		for (int i = lengthOfSting-1; i >=0; i--) 
		{
			revSample=revSample+sample.charAt(i);
		}
		System.out.println(revSample);

	}

}
