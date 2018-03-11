package FullExercise;

import java.util.Scanner;

public class Ex6_Sochinhphuong {
	public static Boolean Sochinhphuong(int n) {
		if (n <= 3)
			return false;
		int temp = (int) Math.sqrt(n);
		if (temp * temp == n) {
			return true;
		} else {
			return false;
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		for (int i = 4; i <= n; i++) {
			if (Sochinhphuong(i) == true)
				System.out.print(i + " ");
		}
	}
}