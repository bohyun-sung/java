package Chap_2;

import java.util.Scanner;

public class ArrayEqual {
	//�� �迭�� �������� �Ǵ�
	// �� �迭 a,b�� ��� ��Ұ� ������?
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
		
		System.out.print("�迭 a�� ��ڼ�");
		int na = scanner.nextInt();
		
		int[]a = new int[na];
		for (int j = 0; j < na; j++) {
			System.out.print("a[" + j + "] : ");
			a[j] = scanner.nextInt();
		}
		System.out.print("�迭 b�� ��ڼ�");
		int nb = scanner.nextInt();
		
		int[] b = new int[nb];
		
		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = scanner.nextInt();
		}
		System.out.println("�迭 a��b�� " + (equals(a, b) ? "�����ϴ�" : "�ٸ��ϴ�"));
		
	}
	
}
