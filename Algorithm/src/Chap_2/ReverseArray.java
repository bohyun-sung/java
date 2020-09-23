package Chap_2;

import java.util.Scanner;

public class ReverseArray {
	//배열 요소 a[idx1] 과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; 
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		for (int i = 0; i < a.length; i++) {
			swap(a, i, a.length - i - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdId.nextInt();
		
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdId.nextInt();
		}
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}
