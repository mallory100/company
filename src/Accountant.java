import java.util.List;

public class Accountant extends Employee {

	public Accountant(String xname, int xsalary) {
		super(xname, xsalary);
		// TODO Auto-generated constructor stub
	}
	
	public void countSalary(List<Employee> xallEmployee){
		
		int sumOfsalaries = 0;
		for (int i=0; i<xallEmployee.size(); i++){
			
			sumOfsalaries = sumOfsalaries + xallEmployee.get(i).getSalary();
			System.out.println("Pracownicy "+ xallEmployee.get(i).getName());
		}
		System.out.println("Suma zarobków w firmie to   : "+ sumOfsalaries);
		
		
		
		
		
	}

}