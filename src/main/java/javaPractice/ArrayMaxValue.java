package javaPractice;

public class ArrayMaxValue {

	public static void main(String[] args) {
		int[] arr= {2,4,6,1,9,7,5};
		int arrMax=arr[0];
		
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]>arrMax)
			{
				arrMax=arr[i];
			}
		}
		System.out.println("Maximum value in Array is: "+arrMax);

	}

}
