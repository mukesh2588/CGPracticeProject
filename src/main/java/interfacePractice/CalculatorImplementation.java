package interfacePractice;

public class CalculatorImplementation implements Calculator {

	@Override
	public int addition(int a, int b) 
	{
		
		return a+b;
	}

	@Override
	public int subtraction(int a, int b)
	{
		
		return a-b;
	}
	
	public int additionThreeNumbers(int a, int b , int c)
	{
		return a+b+c;
	}
	

}
