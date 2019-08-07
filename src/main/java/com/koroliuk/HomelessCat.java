package com.koroliuk;

@Blohable
public class HomelessCat extends Animal{

	private boolean sickness;
	@ColorAnn(color = "Black")
	private String color;

	public HomelessCat(String name, boolean sickness) {
		super(name);
		this.sickness = sickness;
	}

	@Override
	public String toString() {
		return "HomelessCat [sickness=" + sickness + ", name=" + name + "]";
	}

}
