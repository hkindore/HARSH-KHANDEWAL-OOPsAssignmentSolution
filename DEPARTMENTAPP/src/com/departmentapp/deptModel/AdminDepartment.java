package com.departmentapp.deptModel;

public class AdminDepartment extends SuperDepartment{

	//method name: departmentName
	//arguments: none
	//returns: a string value
	//description: returns department name as "Admin Department"
	public String departmentName() {
		return "Admin Department";
	}
	
	//method name: getTodaysWork
	//arguments: none
	//returns: a string value
	//description: returns todays work as "Complete your documents submission"
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	//method name: getWorkDeadline
	//arguments: none
	//returns: a string value
	//description: returns work deadline as "Complete by EOD"
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}