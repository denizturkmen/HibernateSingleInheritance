package com.denizturkmen.Entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Table")
@DiscriminatorValue(value = "EmployeeType") // Kalıtım alınan sınifı belirtmek
public class Employee extends Person {

	@Column(name = "Salary",columnDefinition = "DECIMAL(7,2)") //şu demek 1234567.12
	private Double salary;
	
	@Column(name = "Date_Of_Joining")
	private Date doj;
	
	@Column(name = "dept_name",length = 30)
	private String deptName;
	
	@Column(name = "bonus",precision = 6,scale = 3)
	private BigDecimal bonus;
	
	@Column(name = "email",length = 40)
	private String email;

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public BigDecimal getBonus() {
		return bonus;
	}

	public void setBonus(BigDecimal bonus) {
		this.bonus = bonus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", doj=" + doj + ", deptName=" + deptName + ", bonus=" + bonus
				+ ", email=" + email + "]";
	}
	
	
	
	
}
