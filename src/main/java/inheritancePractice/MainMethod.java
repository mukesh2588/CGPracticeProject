package inheritancePractice;


public class MainMethod {

	public static void main(String[] args) 
	{
		ClassA objA=new ClassA();
		ClassB objB=new ClassB();
		ClassC objC=new ClassC();
		
		ClassB objAB=new ClassC();
		

		System.out.println(objA.addition(5, 7));
		
	//	objB.multiply(8, 9);
		
		System.out.println(objB.addition(7, 9));
		
		
		
		
		
		

	}

}
