package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFindNumberOfOccuranceOfSubString {

	public static void main(String[] args) {
		String str="I am Mukesh and Mukesh lives in Pune";
		String subStr="Mukesh";
		int count=0,index=0;
		List<Integer> indices=new ArrayList<Integer>();
		
		//using split method
		int countString=str.split(subStr).length-1;
		System.out.println("Occurance of \""+subStr+"\" in \""+str+"\" is: "+countString);
		
		//Using Regular expression
		Pattern pattern=Pattern.compile(subStr);
		Matcher match=pattern.matcher(str);
		while(match.find(index))
		{
			count++;
			indices.add(match.start());
			index=match.start()+1;
		}
		
		System.out.println("Occurance of \""+subStr+"\" in \""+str+"\" is: "+count);
		System.out.println("Indeices of Substring: "+indices);
		
		
		

	}

}
