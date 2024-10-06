package polymorphism;

public class MainMethodClass {

	public static void main(String[] args) {
		
		BaseClass obj1=new BaseClass(); //BaseClass reference and object	
		BaseClass obj2=new DerivedClass();  // BaseClass reference but Derived class object
		DerivedClass obj3=new DerivedClass(); // DerivedClass reference and Derived class object
		
		obj1.methodToOverride();
		obj2.methodToOverride();
		
		obj3.methodToOverride();
		
		

	}

}
