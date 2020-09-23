package Chap_1;

import java.util.Scanner;

public class TestCode_2 {
	public static void main(String[] args) {
	int a;
	int b;
	int sum;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("a의 값 :");
	a = scanner.nextInt();
	do {
		System.out.println("b의 값 :");
		b = scanner.nextInt();
		if (a >= b) {
			System.out.println("a보다 큰 값을 입력하세요");
		}
	} while (a >= b);
	sum = b- a;
	System.out.println("b - a 는 "+sum);
		
		int value =0;
		int result =0;
		
		do {
			System.out.print("value의 값 :");
			value = scanner.nextInt();
			if (value >= 0) {
				System.out.println("양수를 입력하시오");
			}
		} while (value <= 0);
			if (value >= 1000) {
				result = 4;
			}else if (value >= 100) {
				result = 3;
			}else if (value >= 10) {
				result =2;
			}else if (value >=1) {
				result =1;
			}
			System.out.println("그수는 "+result +"자리 입니다");
	}
}
