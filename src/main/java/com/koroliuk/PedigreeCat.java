package com.koroliuk;

public class PedigreeCat extends Animal {

	private boolean sickness;
	@ColorAnn(color = "Black")
	private String color;

	public PedigreeCat(String name, boolean sickness) {
		super(name);
		this.sickness = sickness;
	}

	@Override
	public String toString() {
		return "PedigreeCat [sickness=" + sickness + ", name=" + name + "]";
	}

}
