package javaPractice;

import java.util.Scanner;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
	//	int num=371;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for Amrstrong chceck: ");
		int num=sc.nextInt();
		
		int originalNum,remainder;
		int result=0;
		
		originalNum=num;
		
		while(originalNum!=0)
		{
			remainder=originalNum%10;
			result=result+(int)Math.pow(remainder, 3);
			originalNum=originalNum/10;
			
		}
	//	System.out.println(result);
		if(result==num)
		{
			System.out.println("Number \""+num+"\" is Armstrong number");
		}
		else
		{
			System.out.println("Number \""+num+"\" is not Armstrong number");
		}

	}

}
