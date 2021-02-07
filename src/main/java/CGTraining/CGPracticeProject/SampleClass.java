package CGTraining.CGPracticeProject;

public class SampleClass {
	
	/*
	public void checkAge(int age)
	{
		if(age<15)
			throw new ArithmeticException("Not eligible for voting");
		else
			System.out.println("Eligible for voting");
	}
	*/
	public int div(int a, int b) throws ArithmeticException
	{
		int t= a/b;
		return t;
	}

	public static void main(String[] args) 
	{
		SampleClass obj=new SampleClass();
		//obj.checkAge(13);
		try
		{
			System.out.println(obj.div(15, 0));
		}
		catch(ArithmeticException e)
		{
			System.out.println("YUo should not divide numnber by 0");
		}
		catch(Exception e)
		{
			System.out.println("Exception main");
		}
		
		
		finally
		{
			System.out.println("This is finally block");
		}
		
		Class<?> cls=obj.getClass().getSuperclass();
		System.out.println(cls);
		
	}
}
