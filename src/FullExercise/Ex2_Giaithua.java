package FullExercise;

import java.util.Scanner;

public class Ex2_Giaithua {
	public static long TinhGiaiThua(int n) {
		long gt = 1;
		if (n <= 0)
			gt = 0;
		else {
			for (int i = 1; i <= n; i++) {
				gt *= i;
			}
		}

		return gt;

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n giai thua: ");
		int n = scanner.nextInt();
		System.out.println(TinhGiaiThua(n));
	}
}
