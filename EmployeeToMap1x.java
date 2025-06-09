package org.revision.June25;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeToMap1x {

    public static void main(String[] args) {
        System.out.println("EmpTpMap");

        List<Employee> emp = Arrays.asList(
            new Employee("Trent", "Boyle", 2500),
                new Employee("Frazer", "Dewar", 1500),
                new Employee("Deepak", "Patalida", 2570),
                new Employee("Deepak", "Nakerd", 2560)

                );

        for (Employee e1 : emp ) {
            System.out.println(e1.getFname() + " " + e1.getLname() + " " + e1.getSalary() );
        }

        /* Employee to String */

        List<String> e1 = emp.stream()
                .map(Employee::toString)
                .collect(Collectors.toList());
        System.out.println(e1);

        /* convert Employee to String */

        List<String> e2 = emp.stream()
                .filter(x -> x.getSalary() > 2000)
                .map(Employee::toString)
                .collect(Collectors.toList());

        System.out.println(e2);

        //Map<String, Long>  counts = new HashMap<String, Long>();

        Map<String, Long> empcounts   = emp.stream()
                //.collect(Collectors.groupingBy(Employee::getFname))
                .collect(Collectors.groupingBy(Employee::getFname, Collectors.counting()));

        System.out.println(empcounts);

    }
}
