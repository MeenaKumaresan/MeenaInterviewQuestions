package workout.java8practise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
    public static void main(String args[]){
        List<Employee> employeeList = new ArrayList<>();
        //Creating Employee List
        employeeList.add(new Employee(1,"sanjay",28,"male","java",2016,50000.0));
        employeeList.add(new Employee(1,"keerthi",27,"Female","HR",2014,30000.0));
        employeeList.add(new Employee(1,"meena",26,"Female","java",2016,40000.0));
        employeeList.add(new Employee(1,"poorni",29,"Female","HR",2014,20000.0));
        System.out.println("before sorting------:");
        employeeList.forEach(x->System.out.println(x.getName()));
        //Sort using comparator by java 8
        employeeList.sort(Comparator.comparing(Employee::getName).reversed().thenComparing(Employee::getAge));
        System.out.println("After sorting------:");
        employeeList.forEach(x->System.out.println( x.getName()));
        //descendingOrder
        //Comparator.nullsFirst(Employee::getName)
        employeeList.sort(Comparator.comparing(Employee::getName).reversed());
        System.out.println("descending order------:");
        employeeList.forEach(x->System.out.println(x.getName()));
        

        //comparing based on deparment then compare by name

        employeeList.sort(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getName));
        System.out.println("comparing based on deparment then compare by name------:");
        employeeList.forEach(x->System.out.println(x.getDepartment()+" "+x.getName()));
    }
}
