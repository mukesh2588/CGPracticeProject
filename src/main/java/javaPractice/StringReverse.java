package javaPractice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Mukesh Khedkar";
		String strRev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			strRev=strRev+str.charAt(i);
		}
		
		System.out.println(strRev);
	}

}
