package interfacePractice;

public class MainCalculator {

	public static void main(String[] args)
	{
		CalculatorImplementation calc=new CalculatorImplementation();
		
		Calculator calc2=new CalculatorImplementation();
		
		
		int add=calc.addition(5, 7);
		System.out.println("Addition of numbers is "+add);
		
		int sub=calc.subtraction(9, 7);
		System.out.println("Subtraction of number is "+sub);
		
		int addInt=calc2.addition(12, 10);
		System.out.println(addInt);
		
		
		// calling method from Class 
		int addThree=calc.additionThreeNumbers(1, 2, 3);
		System.out.println(addThree);
		

	}

}
