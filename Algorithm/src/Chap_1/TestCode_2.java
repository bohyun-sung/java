package Chap_1;

import java.util.Scanner;

public class TestCode_2 {
	public static void main(String[] args) {
	int a;
	int b;
	int sum;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("a�� �� :");
	a = scanner.nextInt();
	do {
		System.out.println("b�� �� :");
		b = scanner.nextInt();
		if (a >= b) {
			System.out.println("a���� ū ���� �Է��ϼ���");
		}
	} while (a >= b);
	sum = b- a;
	System.out.println("b - a �� "+sum);
		
		int value =0;
		int result =0;
		
		do {
			System.out.print("value�� �� :");
			value = scanner.nextInt();
			if (value >= 0) {
				System.out.println("����� �Է��Ͻÿ�");
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
			System.out.println("�׼��� "+result +"�ڸ� �Դϴ�");
	}
}
