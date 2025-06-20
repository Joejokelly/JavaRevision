package org.revision.June25;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmplToMap1c {

    public static void main(String[] args) {
        System.out.println("EmplToMap1b");
        /* Employee File */
        List<Employee> emplist = Arrays.asList(
                new Employee("Virat", "Kohli", 10000),
                new Employee("Joe", "Test1", 5600),
                new Employee("Joe", "Test2", 3200),
                new Employee("Joe", "Test3", 21200)

                );

        for (Employee emp : emplist) {
            System.out.println(emp.getFname() + " " + emp.getLname());

        }

        List<Employee> emp = emplist.stream()
                .filter(x -> x.getSalary() > 2000)
                .collect(Collectors.toList());

        for (Employee e1 : emp) {
            System.out.println(e1.getFname() + " " + e1.getLname() + " " + e1.getSalary());

        }

       // List<String> estrr = emp.stream().


        Map<String, Long> employeeCounts = emp.stream()
                .collect(Collectors.groupingBy(Employee::getFname, Collectors.counting()));


        // Convert list to map with counts
        //Map<String, Long> nameCounts = emp.stream()
                //.collect(Collectors.groupingBy(name -> emp, Collectors.counting()));
        System.out.println(employeeCounts);

        //employeeCounts.forEach(Fname, counts -> System.out.println());



    }

}
