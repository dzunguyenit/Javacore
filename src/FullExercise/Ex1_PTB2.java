package FullExercise;

import java.util.Scanner;

public class Ex1_PTB2 {
	public static void GPTB2(float a, float b, float c) {
		float delta = b * b - 4 * a * c;
		if (a == 0) {
			if (b == 0) {
				System.out.println("PT vo nghiem");
			} else {
				System.out.println("PT co 1 nghiem duy nhat: x = " + (-c / b));
			}
		}
		if (delta > 0) {
			System.out.println("PT co 2 nghiem phan biet x1 = " + (-b + Math.sqrt(delta)) / 2 * a + " x2 = "
					+ (-b - Math.sqrt(delta)) / 2 * a);
		} else if (delta == 0) {
			System.out.println("PT co 1 nghiem kep: x = " + (-b / 2 * a));
		} else {
			System.out.println("PT co 1 nghiem kep: x = " + (-b / 2 * a));
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a: ");
		float a = scanner.nextFloat();
		System.out.println("Nhap b: ");
		float b = scanner.nextFloat();
		System.out.println("Nhap c: ");
		float c = scanner.nextFloat();
		GPTB2(a, b, c);
	}

}
