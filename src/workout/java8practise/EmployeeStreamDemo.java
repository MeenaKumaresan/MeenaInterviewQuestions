package workout.java8practise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {
    public static void main(String agrs[]){
        List<Employee> employeeList = new ArrayList<>();
        //Creating Employee List
        employeeList.add(new Employee(1,"sanjay",28,"male","java",2016,50000.0));
        employeeList.add(new Employee(1,"keerthi",27,"Female","HR",2014,30000.0));
        employeeList.add(new Employee(1,"meena",26,"Female","java",2016,40000.0));
        employeeList.add(new Employee(1,"poorni",29,"Female","HR",2014,20000.0));

        //Query:1 Numberof female and male workers in Organization
        findGenderWorkers(employeeList);
        System.out.println("***********************************************************************");

        //Query 2:print all the departments  in Organization
        System.out.println("Query:2 print all the departments in Organization");
        employeeList.stream().map(Employee::getDepartment).collect(Collectors.toSet()).forEach(x-> System.out.println(x));
        System.out.println("     ***********************************************************************");
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        System.out.println("***********************************************************************");

        //Query:3 average age of female and male workers in Organization
        System.out.println("Query:3 average age of female and male workers in Organization");
        Map<String,Double> averageAgeBasedOnGender = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingLong(Employee::getAge)));
        System.out.println(averageAgeBasedOnGender);
        System.out.println("***********************************************************************");

        //Query 4:print employee details of highest salary  in Organization
        System.out.println("Query 4:print employee details of highest salary  in Organization");
        Optional<Employee>  highestSalaryDetails = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(highestSalaryDetails.get().getName());
        System.out.println("***********************************************************************");

        //Query 5:print employee who have joined after 2014 in Organization
        System.out.println("Query 5:print employee who have joined after 2014 in Organization");
        employeeList.stream().filter(x->x.getYearOfJoining()> 2014).forEach(x-> System.out.println(x.getName()));
        System.out.println("***********************************************************************");

        //Query 6:count number of employees in each department of Organization
        System.out.println("Query 6:count number of employees in each department of Organization");
       Map<String,Long> countEmployesBasedOnDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        countEmployesBasedOnDepartment.entrySet().stream()
                .forEach(x->System.out.println("dept:"+x.getKey()+" no of employess" +x.getValue()));
        System.out.println("***********************************************************************");

        //Query 7:average salary of employees in each department of Organization
        System.out.println("Query 7:average salary of employee in each department of Organization");
        Set<Map.Entry<String,Double>> mapEntrySet = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).entrySet();
        mapEntrySet.stream().forEach(x->System.out.println("dept: "+x.getKey()+" averageSalary: "+x.getValue()));
        System.out.println("***********************************************************************");

        //Query 8:youngest female employees in the Organization
        System.out.println("Query 8:youngest female employees in the Organization");
        Optional<Employee> youngFemaleEmployee = employeeList.stream().filter(x -> "Female".equals(x.getGender())).min(Comparator.comparingLong(Employee::getAge));
        System.out.println(youngFemaleEmployee.get().getName());
        System.out.println("***********************************************************************");

       //Query 9:most experienced employees in the Organization
       System.out.println("Query 9:most experienced employees in the Organization");
//        Optional<Employee> experiencedEmployee = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        Map<Integer, List<String>> experiencedEmployeeMap = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getYearOfJoining, Collectors.mapping(Employee::getName, Collectors.toList())
                ));
//        var sortedExperiencedMap = new TreeMap<>(experiencedEmployeeMap);
        experiencedEmployeeMap.entrySet().stream()
                .sorted(Comparator.comparingInt(emp -> emp.getKey()))
                .findFirst().ifPresent(emp -> System.out.println(emp.getValue()));
//        System.out.println(experiencedEmployee.get().getName());



    }

    private static void findGenderWorkers(List<Employee> employeeList) {
        System.out.println("Query:1 Numberof female and male workers in Organization");
        Map<String,Long> noOfworkersBasedOnGender = employeeList.stream()
                .collect(Collectors.groupingBy(Employee ::getGender,Collectors.counting()));
        System.out.println(noOfworkersBasedOnGender);
    }
}