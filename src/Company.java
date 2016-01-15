import java.util.ArrayList;
import java.util.List;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Employee> allEmployees =  new ArrayList<Employee>();
		//Employee[] allEmployees = new Employee()[100];
		
		//Accountant accountant1 = new Accountant("Anna Nowak", 2000);
	//	Developer developer1 = new Developer("Jan Kowalski", 6000);
	
		
		allEmployees.add(0, new Accountant("Anna Nowak", 2000));
		allEmployees.add(1, new Developer("Jan Kowalski", 6000));
		allEmployees.add(2, new Developer("Jerzy Kwiatkowski", 10000));
		
		

		Accountant accountant1 = (Accountant) allEmployees.get(0);
		accountant1.countSalary(allEmployees);
			
	
	
		
		}

		
	
	}


