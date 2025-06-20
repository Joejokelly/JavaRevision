package org.revision.June17.x2025;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp {
    String name;
    String dept;
    int salary;

    public Emp(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}



public class EmpValue {
  public static void main(String[] args) {
      System.out.println("Emplist");

        List<Emp> emps = Arrays.asList(
                new Emp("A", "HR", 300),
                new Emp("x", "IT", 3400),
                new Emp("xu", "YI", 2100),
                new Emp("nu", "SI", 22100),
                new Emp("OI", "MU", 32100)

                );

      Map<String, Map<String, List<Emp>>> result = emps.stream()
              .collect(Collectors.groupingBy(
                      e -> e.dept,
                      Collectors.groupingBy(
                              e -> {
                                  if (e.salary >= 5000) return "High";
                                  else if (e.salary >= 3000) return "Medium";
                                  else return "Low";
                              }
                      )
              ));


      System.out.println(result);


  }


}
