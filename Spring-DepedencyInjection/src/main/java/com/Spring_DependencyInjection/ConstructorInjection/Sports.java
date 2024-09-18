package com.Spring_DependencyInjection.ConstructorInjection;

public class Sports {
     
      String name;

	public Sports(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sports [name=" + name + "]";
	}
      
      
	
	
}
