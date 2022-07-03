package com.departmentapp.deptModel;

public class HrDepartment extends SuperDepartment{

	//method name: departmentName
	//arguments: none
	//returns: a string value
	//description: returns department name as "Hr Department"
	public String departmentName() {
		return "HR Department";
	}
	
	//method name: getTodaysWork
	//arguments: none
	//returns: a string value
	//description: returns today's work as "Fill today's worksheet and mark your attendance"
	public String getTodaysWork() {
		return "Fill today's worksheet and mark your attendance";
	}
	
	//method name: getWorkDeadline
	//arguments: none
	//returns: a string value
	//description: returns work deadline as "Complete by EOD"
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	//method name: doActivity
	//arguments: none
	//returns: a string value
	//description: returns activity as "Team Lunch"
	public String doActivity() {
		return "Team Lunch";
	}
	
}