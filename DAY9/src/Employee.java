
public class Employee 
{
	private void empName(String name)
	{
		System.out.println(name);
		
	}

	private void add(int empId)
	{
		System.out.println(empId);
	}
	
 	       public static void main(String[] args) {
			Employee e = new Employee();
			e.empName("java");
			e.add(83);

	}

}
