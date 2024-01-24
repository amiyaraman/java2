package collections;
import model.Employee;

import java.util.*;

public class UseArrayListInEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> a = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "Tarun", 45000, 12);
		Employee e2 = new Employee(2, "Varun", 55000, 11);
		a.add(e2);
		a.add(e1);
		System.out.println(a);
		Employee e3 = new Employee(1, "Tarun", 45000, 12);
		System.out.println(a.contains(e3));
	}

}
