package FullExercise;

import java.util.Scanner;

public class Ex5_Songuyento {
	public static Boolean Songuyento(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			if (Songuyento(i) == true)
				System.out.print(i + " ");
		}
	}
}