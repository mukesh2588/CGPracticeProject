package inheritancePractice;

public class ClassB extends ClassA
{
	int subtraction(int a, int b)
	{
		System.out.println("Subtraction in Class B");
		return a-b;
	}
	
	int addition(int a, int b)
	{
		System.out.println("Addition inside class B");
		return a+b;
	}
	
}
