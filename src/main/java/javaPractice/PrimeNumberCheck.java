package javaPractice;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13;
		boolean flag = false;
		for(int i=2;i<num/2;i++)
		{
			if(num % i==0)
			{
				flag=true;
				break;
			}
			
		}
		if(!flag)
		{
			System.out.println("Number is Prime number");
		}
		else
		{
			System.out.println("Number is not Prime number");
		}
		
	}

}
