package com.lti.streamapiexamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Info {
	List<Employee> emp=null;
	public void addEmp() {
		emp=new ArrayList<Employee>();
		emp.add(new Employee(101, "Ravi"));
		emp.add(new Employee(102, "Anik"));
		emp.add(new Employee(100, "Raj"));
		emp.add(new Employee(105, "Dhiraj"));
	}
	public List<Employee> sortEmp() {
		return emp.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());
	}
	public List<Employee> sortEmpName() {
		return emp.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
	}
	public List<Employee> filterEmpName(){
		return emp.stream().filter(emp -> emp.getName().startsWith("R")).collect(Collectors.toList());
	}



}