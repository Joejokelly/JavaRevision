package org.revision.June25;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {


    private String fname;
    private String lname;
    private Integer salary;

    public String getFname() {
        return fname;
    }

    public Employee() {}

    public Employee(String fname, String lname, Integer salary) {
            this.fname = fname;
            this.lname = lname;
            this.salary = salary;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", salary=" + salary +
                '}';
    }
}


public class EmpExp1b {

  public static void main(String[] args) {
      System.out.println("EmpExp1b");

      List<Employee> empList = Arrays.asList(
              new Employee("Fred", "Hower", 5000),
              new Employee("park", "Devon", 6500),
              new Employee("Since", "Quaret", 10000)
      );

      for (Employee emp : empList) {
          System.out.println(emp.getFname());
      }

     List<Employee> emp1 =  empList.stream().filter(x -> x.getSalary() > 6000)
              .collect(Collectors.toList());

     //emp1.stream().forEach(fname -> System.out.println(fname.getFname()));

      for  (Employee e : emp1) {
            System.out.println(e.getFname() + " " + e.getSalary());
      }


  }

}
