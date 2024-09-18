package com.Spring_DependencyInjection.SpringLifeCycleMethods;

public class Teacher {
    
	private int id;
	private String name;
	private String subject;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Teacher(int id, String name, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	
	public void init()
	{
		System.out.println("this is init method");
	}
	
	public void destroy()
	{
		System.out.println("this is destroy method");
	}
	
}
