package Chap_3;

import java.util.Scanner;

public class SeqSearchSen {
	//��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� ���� �˻�
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;		//���ʸ� �߰�
		
		while (true) {
			if(a[i] == key)
				break;
			i++;
		}
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = scanner.nextInt();
		int[] x = new int [num + 1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = scanner.nextInt();
		}
		System.out.print("�˻��� �� :");	//Ű ���� �Է�
		int ky = scanner.nextInt();
		
		int idx = seqSearchSen(x, num, ky);	//�迭 x ���� ���� ky�� ��Ҹ� �˻�
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "�� x["+ idx + "] �� �ִ�.");
	}
}
