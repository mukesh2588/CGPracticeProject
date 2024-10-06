package javaPractice;

public class NumberReverse {

	public static void main(String[] args) {
		int num=12345;
		int numRev = 0;
		int remainder=0;
		
		while(num>0)
		{
			remainder=num%10;
			numRev=numRev*10+remainder;
			num=num/10;
		}
		
		System.out.println(numRev);

	}

}
