package com.koroliuk;

public class DomesticCat extends Animal{

	private boolean sickness;
	private String color;

	public DomesticCat(String name, boolean sickness) {
		super(name);
		this.sickness = sickness;
	}

	@Override
	public String toString() {
		return "DomesticCat [sickness=" + sickness + ", name=" + name + "]";
	}
	
}
