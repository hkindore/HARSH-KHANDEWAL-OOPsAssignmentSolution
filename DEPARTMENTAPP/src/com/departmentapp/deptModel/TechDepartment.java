package com.departmentapp.deptModel;

public class TechDepartment extends SuperDepartment {
	
	//method name: departmentName
	//arguments: none
	//returns: a string value
	//description: returns department name as "Tech department"
	public String departmentName() {
		return "Tech Department";
	}
	
	//method name: getTodaysWork
	//arguments: none
	//returns: a string value
	//description: returns todays work as "Complete coding of Module 1"
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}
	
	//method name: getWorkDeadline
	//arguments: none
	//returns: a string value
	//description: returns work deadline as "Complete by EOD"
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	//method name: getTechStackInformation
	//arguments: none
	//returns: a string value
	//description: returns tech stack information as "Core Java"
	public String getTechStackInformation() {
		return "Core Java";
	}

}

