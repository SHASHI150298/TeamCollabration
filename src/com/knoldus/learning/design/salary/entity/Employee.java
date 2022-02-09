package com.knoldus.learning.design.salary.entity;


import com.knoldus.learning.design.salary.type.DepartmentType;
import com.knoldus.learning.design.salary.type.EmployeeType;

public class Employee {

    private int id;
    private String name;
    private Contact contact;
    private DepartmentType departmentType;
    private Salary salary;
    private EmployeeType type;
    
	public Employee(int id, String name, Contact contact, DepartmentType departmentType, Salary salary, EmployeeType type) {

		this.id = id;
		this.name = name;
		this.contact = contact;
		this.departmentType = departmentType;
		this.salary = salary;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public DepartmentType getDepartmentType() {
		return departmentType;
	}
	public void setDepartmentType(DepartmentType departmentType) {
		this.departmentType = departmentType;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public EmployeeType getType() {
		return type;
	}
	public void setType(EmployeeType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", contact=" + contact +
				", departmentType=" + departmentType +
				", salary=" + salary +
				", type=" + type +
				'}';
	}
}
