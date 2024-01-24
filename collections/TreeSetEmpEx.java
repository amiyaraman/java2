package collections;
import model.Employee;

import java.util.*;



public class TreeSetEmpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> st = new TreeSet<Employee>();
		Employee e1 = new Employee(1, "Tarun", 45000, 10);
		Employee e2 = new Employee(2, "Varun", 55000, 20);
		Employee e3 = new Employee(4, "barun", 65000, 10);
		Employee e4 = new Employee(3, "karun", 35000, 20);
		//Set<String> st = new TreeSet<String>();
		st.add(e1);
		st.add(e2);
		st.add(e3);
		st.add(e4);
		System.out.println("**********************"+st);
		
		//one way to use comparator class 
//		Comparator<Employee> cm =new OneMoreWayToCompare();
//		Set<Employee> st2 = new TreeSet<Employee>(cm);
		
		//another way 
		Set<Employee> st2 = new TreeSet<Employee>(new OneMoreWayToCompare());
		st2.add(e1);
		//System.out.println("_*_*_*_*_*_*_*_*_*_*_"+st2);
		st2.add(e2);
		//System.out.println("_*_*_*_*_*_*_*_*_*_*_"+st2);
		st2.add(e3);
		//System.out.println("_*_*_*_*_*_*_*_*_*_*_"+st2);
		st2.add(e4);
		System.out.println("_*_*_*_*_*_*_*_*_*_*_"+st2);
		
		st2.forEach((Employee e)->{
			System.out.println(e.getEmpName());
		});
	}
	


}
