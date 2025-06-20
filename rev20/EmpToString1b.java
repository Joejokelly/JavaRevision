package org.revision.June25;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpToString1b {

    public static void main(String[] args) {
        System.out.println("EmpToString1b");

        System.out.println("EmplToMap1b");
        /* Employee File */
        List<Employee> emplist = Arrays.asList(
                new Employee("Sean", "connert", 10000),
                new Employee("fake", "Test1", 5600),
                new Employee("Depa", "Test2", 3200),
                new Employee("Nanker", "Test3", 21200)
        );

        for (Employee emp : emplist) {
            System.out.println(emp.getFname() + " " + emp.getLname());
        }

        List<String> liststr = emplist.stream()
                .map(Employee::toString)
                //.map(Employee::getFname)
                .collect(Collectors.toList());

        System.out.println(liststr.toString());

       // liststr.forEach(System.out::println);

    }

}
