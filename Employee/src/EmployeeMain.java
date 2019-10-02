
public class EmployeeMain {
	public static void main(String args[])
	{
		Employee q;
		Employee emp=new  Employee("Archana");
		emp.setID(524024);
		System.out.println("emp object");
		emp.printDetails();
		
		//An object can have multiple reference
		Employee emp1 = new Employee();
		emp1=emp;
		System.out.println("emp1");
		emp1.printDetails();	//both holds same value
		
		//now modify emp1 to check whether the change is reflected in emp
		emp1.setName("abc");
		emp1.setID(123);
		//Since emp and emp2 is referring to the same object, changes in
		//any of the object will affect both.
		System.out.println("emp1");
		emp1.printDetails();
		System.out.println("emp object");
		emp.printDetails();
		
		Sample e;//it works
		//Calling a function and passing the object
		Employee emp2 = new Employee();
		emp2.setName("ARN");
		emp2.setID(123);
		Method(emp2);
		System.out.println("passed pbject");
		emp2.printDetails();
	    
		int a=10;
		int b=20;
		swap1(a,b);//with primitive types, pass by value works
		System.out.println("a " + a + " b " + b);
		//q.printDetails(); will show error since method is called using an unitialised object
	}
	public static void swap1(int x,int y)
	{
		int temp=x;
		x=y;
		y=temp;
	}
	public static void Method(Employee newemp)
	{ 	
		newemp.setName("xyz");
		newemp.setID(987);
		System.out.println("parameter object");
		newemp.printDetails();
	}
	
}
