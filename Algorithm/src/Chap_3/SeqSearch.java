package Chap_3;

import java.util.Scanner;

public class SeqSearch {

	static int seqSerach(int[] a, int n, int key) {
		int i = 0;
		
		while (true) {
			if (i == n) {
				return -1; 	//�˻� ���� -1�� ��ȯ
			}
			if (a[i] == key) {
				return i;	//�˻� ���� �ε��� ��ȯ
			}
			i ++;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = scanner.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = scanner.nextInt();
		}
		System.out.print("�˻��� ��");
		int ky = scanner.nextInt();
		
		int idx = seqSerach(x, num, ky);	//�迭 x ���� Ű ���� ky�� ��Ҹ� �˻�
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"�� x[" +idx + "]�� �ִ�");
	}
}
