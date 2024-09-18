package com.Spring_DependencyInjection.ConstructorInjection;

public class Games {
  
	String name;
	Sports sp;
	public Games(String name, Sports sp) {
		super();
		this.name = name;
		this.sp = sp;
	}
	@Override
	public String toString() {
		return "Games [name=" + name + ", sp=" + sp + "]";
	}
	

	
	
}
