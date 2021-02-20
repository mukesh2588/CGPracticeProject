package CGTraining.CGPracticeProject;

public class StaticVariableTest {

	static	int i=10;
	public void method1()
	{
		int j=20;
		System.out.println(j);

	}

	public static void main(String[] args) 
	{
		StaticVariableTest obj=new StaticVariableTest();
		System.out.println(StaticVariableTest.i);
		obj.method1();

	}

}
