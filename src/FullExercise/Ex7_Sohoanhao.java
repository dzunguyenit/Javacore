package FullExercise;

import java.util.Scanner;

public class Ex7_Sohoanhao {
	public static Boolean Sohoanhao(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}
		if (sum == n)
			return true;
		return false;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (Sohoanhao(i) == true)
				System.out.print(i + " ");
		}
	}
}