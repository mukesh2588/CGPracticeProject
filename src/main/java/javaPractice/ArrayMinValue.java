package javaPractice;

public class ArrayMinValue {

	public static void main(String[] args) {
		int[] arr= {2,4,6,1,9,7,5};
		int arrMin=arr[0];
		
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]<arrMin)
			{
				arrMin=arr[i];
			}
		}
		System.out.println("Minimum value in Array is: "+arrMin);

	}

}
