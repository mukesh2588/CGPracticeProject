package exceptionCustom;

public class TestCustomException2 {

	public static void main(String[] args) {
		try {
			throw new MyException("MK test");
			
		} catch (Exception e) {
			System.out.println("Cought");
			System.out.println(e.getMessage());
			
		}

	}

}
