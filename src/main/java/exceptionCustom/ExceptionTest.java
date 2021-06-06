package exceptionCustom;

public class ExceptionTest {

	public static void main(String[] args) {

		int num=10;
		int div=0;
		try
		{
			div=num/0;
			System.out.println(div);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}



	}

}
