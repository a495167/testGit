
/**
 * Copyright 2016, FMR LLC.
 * All Rights Reserved.
 * Fidelity Confidential Information */
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

/*
 * Copyright 2017, FMR LLC.
 * All Rights Reserved.
 * Fidelity Confidential Information
 */

/**
 * TODO Auto-generated class JavaDoc for TestSwitch
 *
 * @author a495167
 *
 */
public class TestSwitch {

	public static void main(String arg[]) {

		for (int i = 0; i < 5; i++) {
			System.out.println(UUID.randomUUID().toString());
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(UUID.randomUUID().toString());
		}

	}

	private static void switchWithBreak(String order, ArrayList<Double> listPos) {
		switch (order) {
			case "Desc":
				for (int i = 0; i < listPos.size() - 1; i++) {

					if (listPos.get(i) >= listPos.get(i + 1)) {
						System.out.println("Desc:Sorting correct !!!");
					}
					else {
						System.out.println("Desc:Sorting Is not correct");
					}

				}
				break;
			case "Asc":
				for (int i = 0; i < listPos.size() - 1; i++) {
					if (listPos.get(i) <= listPos.get(i + 1)) {
						System.out.println("Asc:Sorting correct");
					}
					else {
						System.out.println("Asc:Sorting Is not correct");
					}
				}
				break;
			default:
				System.out.println("YYYYY");
		}
		System.out.println("mmmmmm");

	}

	private static void switchWithBreakError(String order, ArrayList<Double> listPos) {
		System.out.println("Error");
		switch (order) {
			case "Desc":
				for (int i = 0; i < listPos.size(); i++) {

					if (listPos.get(i) >= listPos.get(i + 1)) {
						System.out.println("Desc:Sorting correct");
					}
					else {
						System.out.println("Desc:Sorting Is not correct");
					}

				}
				break;
			case "Asc":
				for (int i = 0; i < listPos.size(); i++) {
					if (listPos.get(i) <= listPos.get(i + 1)) {
						System.out.println("Asc:Sorting correct");
					}
					else {
						System.out.println("Asc:Sorting Is not correct");
					}
				}
				break;
			default:
				System.out.println("YYYYY");
		}
		System.out.println("mmmmmm");

	}
}
