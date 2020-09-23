package Chap_2;

import java.util.Scanner;

public class ReverseArray {
	//�迭 ��� a[idx1] �� a[idx2]�� ���� �ٲ�
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; 
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//�迭 a�� ��Ҹ� �������� ����
	static void reverse(int[] a) {
		for (int i = 0; i < a.length; i++) {
			swap(a, i, a.length - i - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = stdId.nextInt();
		
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdId.nextInt();
		}
		
		reverse(x);
		
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}
