package com.knoldus.learning.design.salary;

import com.knoldus.learning.design.salary.entity.Contact;
import com.knoldus.learning.design.salary.entity.Employee;
import com.knoldus.learning.design.salary.entity.Salary;
import com.knoldus.learning.design.salary.type.CurrencyType;
import com.knoldus.learning.design.salary.type.DepartmentType;
import com.knoldus.learning.design.salary.type.EmployeeType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.knoldus.learning.design.salary.util.CurrencyConverter.getSalaryInBaseCurrency;

/**
 * main method implemented
 */
public class MainImpl {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Shakti", new Contact("7621729576", "xyz12@gmail.com"), DepartmentType.IT, new Salary(CurrencyType.USD, 8000), EmployeeType.Fixed));
        list.add(new Employee(111, "Prabhat", new Contact("9875699999", "abc34@gmail.com"), DepartmentType.MANAGEMENT, new Salary(CurrencyType.INR, 96000), EmployeeType.Contract));
        list.add(new Employee(121, "Krishna", new Contact("7885009312", "krish@gmail.com"), DepartmentType.HR, new Salary(CurrencyType.EURO, 7500), EmployeeType.Fixed));
        list.add(new Employee(131, "Vasudev", new Contact("8575600996", "vas12@gmail.com"), DepartmentType.FINANCE, new Salary(CurrencyType.INR, 95000), EmployeeType.PartTime));
        list.add(new Employee(145, "Yaadav", new Contact("8875695299", "yad21@gmail.com"), DepartmentType.MANAGEMENT, new Salary(CurrencyType.YEN, 5500), EmployeeType.Contract));
        list.add(new Employee(191, "Sankata", new Contact("8556521420", "san66@gmail.com"), DepartmentType.HR, new Salary(CurrencyType.EURO, 57000), EmployeeType.Fixed));
        list.add(new Employee(161, "Gajodhar", new Contact("8552145600", "gaj65@gmail.com"), DepartmentType.FINANCE, new Salary(CurrencyType.INR, 76500), EmployeeType.PartTime));
        list.add(new Employee(151, "Birju", new Contact("8820145256", "brj52@gmail.com"), DepartmentType.IT, new Salary(CurrencyType.USD, 86000), EmployeeType.Contract));


        List<Employee> employeeListWithSalaryMoreThanTheRange = list.stream().peek(System.out::println).filter(t -> getSalaryInBaseCurrency(t) >= 5000.0).peek(System.out::println).collect(Collectors.toList());

        System.out.println("Employee whose salary is greater than 5000 are");
        for (Employee employee : employeeListWithSalaryMoreThanTheRange) {
            System.out.println("Name is = " + employee.getName() + " Salary is = " + getSalaryInBaseCurrency(employee));
        }
        }
    }