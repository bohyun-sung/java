package Chap_1;

import java.util.Scanner;

public class TestCode_1 {
	public static void main(String[] args) {
		
		int result = 0;
		for (int i = 1; i <= 7; i++) {
			result += i;
			 
			System.out.print(i+"+");
		}
		System.out.println("="+result);

		Scanner scanner = new Scanner(System.in);
		System.out.println("n의 값은 :");
		int value = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= value; i++) {
			sum += i;
			
		}
		System.out.println("1부터 n까지의 정수 합은 ="+sum);
		System.out.print("a의 값은 :           ");
		int a = scanner.nextInt();
		System.out.print("b의 값은 :");
		int b = scanner.nextInt();
		System.out.println("a와 b의 합은 :"+sumoff(a, b));

		
	}

	private static int sumoff(int a, int b) {
		int sum = 0;
		if (a <= b) {
			for (int i = a; i <= b; i++) {
				sum += i;
			}
		}else {
			for (int i = b; i <= a; i++) {
				sum += i;
			}
		}
		return sum;
	}
}
