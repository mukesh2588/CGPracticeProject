package exceptionCustom;

public class CustomExceptionMK extends Exception 
{
	CustomExceptionMK()
	{
		System.out.println("Inside custom Exception");
	}
	
	CustomExceptionMK(String msg)
	{
		super(msg);
	}
	
}
