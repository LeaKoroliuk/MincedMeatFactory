package com.koroliuk;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {

		/*
		 * 1. Если не @Blohable 2. Если кот черный он с вероятность 50% попадет в фарш
		 * 3. Если кот больной, в фарш не попадет
		 */

		List<Animal> cats = createAnimalArr();
		FarshFactory factory = new FarshFactory(cats);
		try {
			factory.catsCheck();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

	public static List<Animal> createAnimalArr() {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new PedigreeCat("A", false)); // 50%
		animals.add(new DomesticCat("B", true)); // NO
		animals.add(new NotPedigreedCat("C", false)); // NO
		animals.add(new HomelessCat("D", false)); // NO
		animals.add(new PedigreeCat("E", false)); // 50%
		animals.add(new NotPedigreedCat("F", true)); // NO
		animals.add(new DomesticCat("G", false)); // YES
		animals.add(new HomelessCat("H", true)); // NO
		animals.add(new PedigreeCat("I", false)); // 50%
		animals.add(new NotPedigreedCat("J", true)); // NO
		animals.add(new HomelessCat("K", false)); // NO
		animals.add(new DomesticCat("L", false)); // YES
		return animals;
	}
}
