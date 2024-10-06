package javaPractice;

public class SumOfNumbers {

	public static void main(String[] args) {
		int num=23456;
		int numSum=0;
		int remainder=0;
		
		while(num>0)
		{
			remainder=num%10;
			numSum=numSum+remainder;
			num=num/10;
			
		}
		System.out.println(numSum);

	}

}
