package exceptionCustom;

public class ExceptionTestFInally {

	public static void main(String[] args) {

		int num=10;
		try
		{
			int div=num/0;
			System.out.println(div);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally block");
		}



	}

}
