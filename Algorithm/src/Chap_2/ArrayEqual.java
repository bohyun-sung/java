package Chap_2;

import java.util.Scanner;

public class ArrayEqual {
	//두 배열이 같은가를 판단
	// 두 배열 a,b의 모든 요소가 같은가?
	static boolean equals(int [] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수");
		int na = scanner.nextInt();
		
		int[]a = new int[na];
		for (int j = 0; j < na; j++) {
			System.out.print("a[" + j + "] : ");
			a[j] = scanner.nextInt();
		}
		System.out.print("배열 b의 요솟수");
		int nb = scanner.nextInt();
		
		int[] b = new int[nb];
		
		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = scanner.nextInt();
		}
		System.out.println("배열 a와b는 " + (equals(a, b) ? "같습니다" : "다릅니다"));
		
	}
	
}
