package exceptionCustom;

public class UseCustomException   {

	public static void main(String[] args) throws ThisIsCustomDumbException {
		throw new ThisIsCustomDumbException("Custom exception text");

	}

}
