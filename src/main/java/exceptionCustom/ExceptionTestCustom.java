package exceptionCustom;

public class ExceptionTestCustom {

	static void validateAge(int age) throws CustomExceptionMK 
	{
		if(age<18)
			throw new CustomExceptionMK("Invalid Age");
			//throw new CustomExceptionMK();
		else
			System.out.println("Valid Age");

	}

	public static void main(String[] args) 
	{
		try {
			ExceptionTestCustom.validateAge(20);
			ExceptionTestCustom.validateAge(12);
		} 
		catch (CustomExceptionMK e) 
		{
			System.out.println("Caught");	
			//e.printStackTrace();
			System.out.println("Exception occured:-"+e);

		}


	}

}
