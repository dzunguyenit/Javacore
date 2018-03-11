package FullExercise;

import java.util.Scanner;

public class Ex8_Tinhtongcacchuso {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		do {
			sum += n % 10;
			n = n / 10;
		} while (n > 0);
		System.out.println(sum);
	}
}
