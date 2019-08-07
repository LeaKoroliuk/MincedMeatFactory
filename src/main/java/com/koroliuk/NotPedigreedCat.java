package com.koroliuk;

@Blohable
public class NotPedigreedCat extends Animal {

	private boolean sickness;
	@ColorAnn(color = "Ginger")
	private String color;
	
	public NotPedigreedCat(String name, boolean sickness) {
		super(name);
		this.sickness = sickness;
	}

	@Override
	public String toString() {
		return "NotPedigreedCat [sickness=" + sickness + ", name=" + name + "]";
	}

}
