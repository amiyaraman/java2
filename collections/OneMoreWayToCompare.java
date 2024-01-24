package collections;

import model.Employee;

import java.util.*;


public class OneMoreWayToCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getEmpSalary()-o2.getEmpSalary());
			}

}
