package com.ucdi.beans;

import java.util.List;

public class Restaurent {
	
	private List<String> menuItems;

	public void setMenuItems(List<String> menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public String toString() {
		return "Resturent [menuItems=" + menuItems + "]";
	}
	
	

}
