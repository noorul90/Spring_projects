package com.ia.beans;

public class PetAnimal {
	
	private int petPrice;
	private String petType;
	private float weight;
	
	public PetAnimal(int petPrice, String petType) {
		this.petPrice = petPrice;
		this.petType = petType;
	}

	public PetAnimal(String petType, float weight) {
		this.petType = petType;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "PetAnimal [petPrice=" + petPrice + ", petType=" + petType
				+ ", weight=" + weight + "]";
	}
	
	
	
	
	
	

}
