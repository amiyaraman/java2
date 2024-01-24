import model.Employee;

public class UseEmployee {

	public static void createEmployee() {
		// TODO Auto-generated method stub

		
		Employee e1 = new Employee(1,"Ram",50000.0,10);
	    System.out.println(e1); //e1.toString()  by the compiler
	    
	    System.out.println(e1.computeAnnualSalary());
		
		Employee e2 = new Employee(2,"Shyam",60000.0,10);
		System.out.println(e2);
		double annsal = e2.computeAnnualSalary();
		System.out.println(annsal);
		
		System.out.println(e2.getEmpSalary());
		
	    e2.setEmpSalary(1000);
		
		System.out.println(e2.getEmpSalary());

	}

}