package com.shyju.carParking;

import java.util.Scanner;

/**
 * Hello world!
 * 
 */
public class App {

	private static ProcessMovement processMovement = new ProcessMovement();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			if (sc.hasNextInt())
				System.out.println(sc.nextInt());
			else {
				String inputPattern = sc.next();



				processMovement.process(
						Integer.parseInt(inputPattern.split(":")[0].split(",")[0]),
						Integer.parseInt(inputPattern.split(":")[0].split(",")[1]),
						inputPattern.split(":")[1]);
			}
		}

		sc.close();

	}
}
