package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input an integer n>1:");
		int n = in.nextInt();
		boolean[] numbers = new boolean[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = true;

		}
		for (int p = 2; p < n; p++) {

			for (int j = 2; j * p < n; j++) {

				numbers[j * j] = false;
			}
		}
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] = true) {
				System.out.print(i);
			}

		}

	}

}
