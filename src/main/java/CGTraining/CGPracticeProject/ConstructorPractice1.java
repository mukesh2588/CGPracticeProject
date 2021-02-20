package CGTraining.CGPracticeProject;

public class ConstructorPractice1 {


	ConstructorPractice1() 
	{ 
		System.out.println("Default constructor called");
	}

	int age; 
	String name;

	ConstructorPractice1( String name, int age)
	{
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) 
	{
		ConstructorPractice1 obj1=new ConstructorPractice1();
		ConstructorPractice1 obj2=new ConstructorPractice1("Mukesh", 34);
		System.out.println("Age of "+obj2.name+" is "+obj2.age);
		



	}

}
