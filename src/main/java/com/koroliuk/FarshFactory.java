package com.koroliuk;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class FarshFactory {

	private List<Animal> cats;

	public FarshFactory(List<Animal> cats) {
		this.cats = cats;
	}

	public void catsCheck()
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		List<Animal> mincedСats = new ArrayList<Animal>();
		for (Animal animal : cats) {
			if (!ifBlohable(animal) && !ifBlack(animal) && !ifSickness(animal)) {
				mincedСats.add(animal);
			}
			if (!ifBlohable(animal) && ifBlack(animal) && !ifSickness(animal)) {
				if (randomSelectionOfBlackCats() == 1) {
					mincedСats.add(animal);
				}
			}
		}
		System.out.println("Stuffing will be made from these cats:");
		for (Animal animal : mincedСats) {
			System.out.println(animal);
		}
	}

	private boolean ifBlohable(Animal animal) {
		Class clazz = animal.getClass();
		if (clazz.isAnnotationPresent(Blohable.class)) {
			return true;
		}
		return false;
	}

	private boolean ifBlack(Animal animal) throws NoSuchFieldException, SecurityException {
		Class clazz = animal.getClass();
		Field field = clazz.getDeclaredField("color");
		field.setAccessible(true);
		if (field.isAnnotationPresent(ColorAnn.class)) {
			if (field.getAnnotation(ColorAnn.class).color().equals("Black")) {
				return true;
			}
		}
		return false;
	}

	private boolean ifSickness(Animal animal)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class clazz = animal.getClass();
		Field field = clazz.getDeclaredField("sickness");
		field.setAccessible(true);
		if ((Boolean) field.get(animal)) {
			return true;
		}
		return false;
	}

	private int randomSelectionOfBlackCats() {
		return (int) (Math.random() * 2 + 1);
	}

}
