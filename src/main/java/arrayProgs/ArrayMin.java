package arrayProgs;

public class ArrayMin {

	public static void main(String[] args) {
		int [] arrInt= {11,5,17,3,4,107,77,9};
		int min=arrInt[0];
		
		
		for (int i = 1; i < arrInt.length; i++) 
		{
			if(arrInt[i]<min)
			{
				min=arrInt[i];
				
			}
						
		}
		System.out.println(min);
		
		

	}

}
