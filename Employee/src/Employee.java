

public class Employee 
{
	String name;
	int ID;
	public Employee()
	{
		this.name=null;
	}
	public Employee(String name)
	{
	 this.name=name;	 
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setID(int iDval)
	{
		ID=iDval;
	}
	public void printDetails()
	{
		System.out.println("Employee Name :" + name);
		System.out.println("Employee ID :"+ ID);
		//boolean b = name instanceof String;
		//System.out.println(b);
		
	}
}
class Sample
{
	public int i=1;
}
