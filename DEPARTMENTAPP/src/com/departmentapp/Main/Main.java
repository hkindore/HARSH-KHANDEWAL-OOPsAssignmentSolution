package com.departmentapp.Main;

import com.departmentapp.deptModel.*;

public class Main {

	
	public static void main(String[] args) {
		
		AdminDepartment admindep=new AdminDepartment();//create an object to class AdminDepartment
		
		//Call respective methods from AdminDepartment class and display the details
		System.out.println("Welcome to "+ admindep.departmentName());
		System.out.println(admindep.getTodaysWork());
		System.out.println(admindep.getWorkDeadline());
		System.out.println(admindep.isTodayAHoliday());
		System.out.println();
		
		HrDepartment hrdep=new HrDepartment();//create an object to class HrDepartment
		
		//Call respective methods from HrDepartment class and display the details
		System.out.println("Welcome to "+hrdep.departmentName());
		System.out.println(hrdep.doActivity());
		System.out.println(hrdep.getTodaysWork());
		System.out.println(hrdep.getWorkDeadline());
		System.out.println(hrdep.isTodayAHoliday());
		System.out.println();
		
		TechDepartment techdep=new TechDepartment();//create an object to class TechDepartment
		
		//Call respective methods from TechDepartment class and display the details
		System.out.println("Welcome to "+techdep.departmentName());
		System.out.println(techdep.getTodaysWork());
		System.out.println(techdep.getWorkDeadline());
		System.out.println(techdep.getTechStackInformation());
		System.out.println(techdep.isTodayAHoliday());
	}

}
