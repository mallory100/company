
public class Employee {
	
	private String name;
	private int salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String xname, int xsalary){
		this.name = xname;
		this.salary = xsalary;
		
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
}
