package CGTraining.CGPracticeProject;

public class ConstructorPractice 
{

	String name;
	int age;
	/*ConstructorPractice()
	{
		System.out.println("Construcotr called");
	}
	*/
	ConstructorPractice(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	
	
	public static void main(String[] args) 
	{
		ConstructorPractice obj=new ConstructorPractice("Mukesh", 33 );
		System.out.println(obj.age);
		System.out.println(obj.name);
		
		String str= "MukeshKhedkar";
		//System.exit(0);.........program will come out here
		System.out.println(str.substring(0,4));
		
		System.out.println(str.contains("Muke"));
	

	}

}