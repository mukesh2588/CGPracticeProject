package encapsulationPractice;

public class Employee
{
	private int empID;        // data hiding
	
	public void setEmpId(int empID1)
	{
		empID=empID1;
	}
	
	public int getEmpID()
	{
		return empID;
	}
	
}
