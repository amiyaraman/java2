package collections;
import model.Employee;

import java.util.*;


public class HashSetEmpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> a = new HashSet<Employee>();
		Employee e1 = new Employee(1, "Tarun", 45000, 10);
		Employee e2 = new Employee(2, "Varun", 55000, 20);
		Employee e3 = new Employee(1, "barun", 45000, 10);
		Employee e4 = new Employee(2, "karun", 55000, 20);
		
		a.add(e2);
		a.add(e1);
		a.add(e4);
		a.add(e3);
		System.out.println(a);
		System.out.println(a.contains(new Employee(2, "karun", 55000, 20)));

	}

}
