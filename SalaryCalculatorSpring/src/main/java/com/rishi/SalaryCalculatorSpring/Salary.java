package com.rishi.SalaryCalculatorSpring;

public class Salary {
	
	int hourlyPay;
	int daysworked;
	int hoursWorkedinDay;
	int totalSalary;
	
	public Salary(int hourlyPay, int daysworked, int hoursWorkedinDay) {
		super();
		this.hourlyPay = hourlyPay;
		this.daysworked = daysworked;
		this.hoursWorkedinDay = hoursWorkedinDay;
	}
	
		
	public int getHourlyPay() {
		return hourlyPay;
	}

	public int getDaysworked() {
		return daysworked;
	}

	public int getHoursWorked() {
		return hoursWorkedinDay;
	}

	public int getTotalSalary() {
		return totalSalary;
	}


	public int CalculateSalary() {
		
		totalSalary = this.hourlyPay * this.hoursWorkedinDay * this.daysworked;
		return totalSalary;
	}

}
