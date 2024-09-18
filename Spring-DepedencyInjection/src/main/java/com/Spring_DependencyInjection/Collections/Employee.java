package com.Spring_DependencyInjection.Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    
	private int id;
	private String name;
	
	private List<String> phnno;
	private Set<String> address;
	private Map<String,Integer> course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhnno() {
		return phnno;
	}
	public void setPhnno(List<String> phnno) {
		this.phnno = phnno;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, Integer> getCourse() {
		return course;
	}
	public void setCourse(Map<String, Integer> course) {
		this.course = course;
	}
	public Employee(int id, String name, List<String> phnno, Set<String> address, Map<String, Integer> course) {
		super();
		this.id = id;
		this.name = name;
		this.phnno = phnno;
		this.address = address;
		this.course = course;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phnno=" + phnno + ", address=" + address + ", course="
				+ course + "]";
	}
	
	
	
}
