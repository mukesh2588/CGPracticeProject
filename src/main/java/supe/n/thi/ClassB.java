package supe.n.thi;

public class ClassB extends ClassA
{
	int a=20;
	
	void show(int a)
	{
		System.out.println("Locatl value is "+a);
		System.out.println("Value from current class "+this.a);
		System.out.println("Value from Super/Parent class "+super.a);
		
	}
}
