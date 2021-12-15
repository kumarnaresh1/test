package spring_boot_practice.sping_boot_demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class Managers {

	String empNo;
	String empName;
	float vacationDays=0;
	double Salary;
	float totalVacDaysRemained=0;
	
	public float getTotalVacDaysRemained() {
		return totalVacDaysRemained;
	}
	public void setTotalVacDaysRemained(float totalVacDaysRemained) {
		this.totalVacDaysRemained = totalVacDaysRemained;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getVacationDays() {
		return vacationDays;
	}
	public void setVacationDays(float vacationDays) {
		this.vacationDays = vacationDays;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Managers(String empNo, String empName, float vacationDays, double salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.vacationDays = vacationDays;
		Salary = salary;
	}

	public float Work(float workedDays) {
		if (workedDays > 0 && workedDays <= 260) {

			vacationDays = (workedDays / 260) * 30;
		}
		return vacationDays;

	}
	
	public void TakeVacation(float vacationDaysUsed) {
		if (vacationDaysUsed>0) {

			totalVacDaysRemained = 30-vacationDaysUsed;
		}

	}
	
	
}
