package exceptionCustom;

public class TestCustomException1 {
	
	static void validateAge(int age)throws InvalidAgeException
	{
		if(age<18)
			throw new InvalidAgeException("Age not valid");
		else
			System.out.println("Valid Age for voting");
	}	

	public static void main(String[] args) 
	{
		try
		{
		validateAge(18);
		validateAge(12);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured"+m);
		}
		
				
	}

}
