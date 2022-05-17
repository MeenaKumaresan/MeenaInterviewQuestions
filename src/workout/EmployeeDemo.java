package workout;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {
    public static void main(String[] args) {
        //    //Convert this to list of string containing employee names
        final List<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee("5", "Five"));
        employees1.add(new Employee("4", "Four"));
        System.out.println(employees1);
        employees1.stream().map(x->x.getName()).collect(Collectors.toList());


    }
}
