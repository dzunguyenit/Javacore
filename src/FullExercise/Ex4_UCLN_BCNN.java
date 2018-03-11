package FullExercise;

import java.util.Scanner;

public class Ex4_UCLN_BCNN {
	public static int UCLN(int a, int b) {
		while (a != b) {
			if (a > b)
				a -= b;
			else
				b -= a;
		}
		return a;
	}

	public static int BCNN(int a, int b) {
		return (a * b) / UCLN(a, b);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = sc.nextInt();
		System.out.println("Nhap b: ");
		int b = sc.nextInt();
		System.out.println("UCLN = " + UCLN(a, b));
		System.out.println("BCNN = " + BCNN(a, b));
	}
}
