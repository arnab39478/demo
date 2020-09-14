package com.lti.streamapiexamples;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info i=new Info();
		i.addEmp();
		System.out.println(i.sortEmp());
		System.out.println(i.sortEmpName());
		System.out.println(i.filterEmpName());
		
	}

}