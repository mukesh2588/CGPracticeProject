package javaPractice;

import java.util.Arrays;

public class StringAnagramProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Care";
		String str2 = "Race";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) 
		{
			char[] str1CharArr = str1.toCharArray();
			char[] str2CharArr = str2.toCharArray();

			Arrays.sort(str1CharArr);
			Arrays.sort(str2CharArr);

			boolean resultFlag = Arrays.equals(str1CharArr, str2CharArr);

			if (resultFlag) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not anagram");
			}
		}
		else
			System.out.println("Not Anagram");

	}

}
