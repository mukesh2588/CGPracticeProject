package arrayProgs;

public class ArrayMax {

	public static void main(String[] args) {
		int [] arrInt= {1,5,17,3,4,107,77,9};
		int max=arrInt[0];
		
		
		for (int i = 1; i < arrInt.length; i++) 
		{
			if(arrInt[i]>max)
			{
				max=arrInt[i];
				
			}
						
		}
		System.out.println(max);
		
		

	}

}
