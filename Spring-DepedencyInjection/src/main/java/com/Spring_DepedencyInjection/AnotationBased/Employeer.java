package com.Spring_DepedencyInjection.AnotationBased;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employeer {
    
	@Autowired
	Employee employee;
	
	private List<String> phn;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<String> getPhn() {
		return phn;
	}

	public void setPhn(List<String> phn) {
		this.phn = phn;
	}

	public Employeer(Employee employee, List<String> phn) {
		super();
		this.employee = employee;
		this.phn = phn;
	}

	public Employeer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employeer [employee=" + employee + ", phn=" + phn + "]";
	}
   
	
	
	
	
}
