package collections;

import model.Employee;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {
    public static void main(String[] args) {
        // Create a SortedSet of Employees using a TreeSet with a custom Comparator
        SortedSet<Employee> employeeSet = new TreeSet<>(new EmployeeNameComprator());

        Employee emp1 = new Employee(101, "Ravi Kumar", 50000.0, 1);
        Employee emp2 = new Employee(103, "Priya Sharma", 60000.0, 2);
        Employee emp3 = new Employee(102, "Arun Singh", 55000.0, 1);

        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);

        System.out.println("Sorted Set of Employees based on empName:");
        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }
    }
}
