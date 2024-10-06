package exceptionCustom;

@SuppressWarnings("serial")
public class ThisIsCustomDumbException extends Exception{
	public ThisIsCustomDumbException(String errorMessage)
	{
		super(errorMessage);
	}

}
