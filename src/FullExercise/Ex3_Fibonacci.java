package FullExercise;

import java.util.Scanner;

public class Ex3_Fibonacci {
	public static int Fibonacci(int n) {
		if (n < 0)
			return -1;
		else if (n == 0 || n == 1)
			return n;
		else
			return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print(Fibonacci(i) + " ");
		}
	}
}