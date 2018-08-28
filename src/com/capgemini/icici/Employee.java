package com.capgemini.icici;

public class Employee {
	private double employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	private double basicSalary;
	private final double SPECIAL_ALLOWANCE = 250.80;
	private final double HRA = 1000.50;
	
	public Employee(){
		
	}
	
	public Employee(double employeeId,String employeeName,String employeeAddress,long employeePhone)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}
	
	public double calculateSalary()
	{
		double salary = basicSalary + (basicSalary * SPECIAL_ALLOWANCE/100) + (basicSalary * HRA/100);
		return salary;
	}
	
	

}
