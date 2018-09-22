package com.ucdi.beans;

import java.util.Set;

public class Restaurent {
	
	private Set<String> menuItems;

	public Restaurent(Set<String> menuItems) {
		
		this.menuItems = menuItems;
	}

	@Override
	public String toString() {
		return "Restaurent [menuItems=" + menuItems + "]";
	}
	
}
