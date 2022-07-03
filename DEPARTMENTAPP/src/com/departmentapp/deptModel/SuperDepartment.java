package com.departmentapp.deptModel;

//Declare a class with name SuperDepartment which is parent class
public class SuperDepartment {
	
	//method name: departmentName
	//arguments: none
	//returns: a string value
	//description: returns department name as Super Department
	protected String departmentName()	{
		return "Super Department";
	}
	
	//method name: getTodaysWork
	//arguments: none
	//returns: a string value
	//description: returns today's work as "No Work as of now"
	protected String getTodaysWork() {
		return "No Work as of now";
	}
	
	//method name: getWordDeadline
	//arguments: none
	//returns: a string value
	//description: returns work deadline as "Nil"
	protected String getWorkDeadline() {
		return "Nil";
	}
	
	//method name: isTodayAHoliday
	//arguments: none
	//returns: a string value
	//description: returns a string telling if today is holiday or not as "Today is not a holiday"
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}
