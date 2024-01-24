package collections;

import model.Employee;
import model.Manager;

import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Employee e2 = new Employee(2, "Varun", 55000, 20);
        Employee e1 = new Employee(1, "Tarun", 45000, 10);
        Employee e3 = new Employee(3, "barun", 45000, 10);
        Employee e4 = new Employee(4, "karun", 55000, 20);

        Manager m = new Manager(10,"Shivangi",100000,2,10000,10,20000);
        Manager m1 = new Manager(11,"Nishu",100000,2,10000,10,20000);
        Manager m2 = new Manager(11,"Prakhar",100000,2,10000,10,20000);


        TreeMap<Employee, Manager> mp = new TreeMap<>();
        mp.put(e1, m2);
        mp.put(e2, m);
        mp.put(e3, m1);
        mp.put(e4, m2);
        //Manager mg1;

//		System.out.println(mp);
//
//		for(Employee e: mp.keySet()) {
//			mg1 = mp.get(e);
//			System.out.println("manager of Employee: "+e.getName()+" is "+ mg1.getName());
//		}

        //checking for employee
        System.out.println("checking for employee:" + (mp.containsKey(new Employee(2, "karun", 55000, 20))));

        mp.forEach((Employee ee, Manager mm)->{
            System.out.println(ee.getEmpName()+" "+ mm.getEmpName());
        });

        Set<Employee> se = mp.keySet();
        System.out.println(se);

        Collection<Manager> lst = mp.values();
        System.out.println("collection****** "+lst);


    }
}
