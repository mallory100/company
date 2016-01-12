
public class Accountant extends Employee {

	public Accountant(String xname, int xsalary) {
		super(xname, xsalary);
		// TODO Auto-generated constructor stub
	}
	
	public int countSalary(Employee xemployee){
		return xemployee.getSalary();
		
		
	}

}