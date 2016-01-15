import java.util.List;

public class Accountant extends Employee {

	public Accountant(String xname, int xsalary) {
		super(xname, xsalary);
		// TODO Auto-generated constructor stub
	}
	
	public void countSalary(List<Employee> xallEmployee){
		
		int sumOfsalaries = 0;
		for (Employee xEmployee : xallEmployee){
			
			sumOfsalaries = sumOfsalaries + xEmployee.getSalary();
			System.out.println("Pracownik: "+ xEmployee.getName());
		}
		System.out.println("Suma zarobków w firmie to   : "+ sumOfsalaries);
		
		
		
		
		
	}

}