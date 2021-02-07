package javaPractice;

public class LoopPractice {

	public static void main(String[] args) {
		int arr[]= {12,78,55,74,9};
		int total=0;
		for(int i:arr)
		{
			System.out.println(i);
		}
		for(int i:arr)
		{
			total=total+i;
		}
		System.out.println("Valus of total is-"+total);
		

	}

}
