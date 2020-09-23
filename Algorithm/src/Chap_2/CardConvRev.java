package Chap_2;

import java.util.Scanner;

public class CardConvRev {
	//�Է� ���� 10������ 2���� ~ 36������ ��� ��ȯ�Ͽ� ��Ÿ��
	//������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ����̺��� �־�ΰ� �ڸ����� ��ȯ�մϴ�.
	static int cardConvR(int x, int r, char[] d) {
		int digits =0;
		String dchar ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		}while (x != 0);
		return digits;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int no;						//��ȯ�ϴ� ����
		int cd;						//���
		int dno;					//��ȯ ���� �ڸ���
		int retry;					//�ٽ� �ѹ�?
		char[] cno = new char[32];	//��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� :");
				no = scanner.nextInt();
			} while(no < 0);
			
			do {
				System.out.println("� ������ ��ȯ�ұ��? (2~36) : ");
				cd = scanner.nextInt();
			}while (cd < 2 || cd >36);
			dno = cardConvR(no, cd, cno);
			
			System.out.print(cd + "�����δ� ");
			for (int i = dno -1; i >= 0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�.");			
			System.out.print("�� �� �� �ұ�? (1.��/0.�ƴϿ�) :");
			retry = scanner.nextInt();
		}while (retry == 1);
	}
}


