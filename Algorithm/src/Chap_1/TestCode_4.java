package Chap_1;

import java.util.Scanner;

public class TestCode_4 {
	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        System.out.println("�ﰢ�� ������� ��Ÿ���ϴ�.");
 
        do {
            System.out.print("�ܼ��� ��");
            n = stdIn.nextInt();
        } while (n <= 0);
        a(n); 
        b(n); 
        c(n);
        d(n);
        spira(n);
        npira(n);
 
    }
    static void a(int n) {
        System.out.println("���� �Ʒ��� ������ �ﰢ��");
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void b(int n) {
        System.out.println("���� ���� ������ �ﰢ��");
        for (int i = n; i > 0; i--) {
            for (int j = i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void c(int n) {
        System.out.println("������ ���� ������ �ﰢ��");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        
    }
    static void d(int n) {
        System.out.println("������ �Ʒ��� ������ �ﰢ��");
        for (int i = 1; i <= n; i++) {
            for (int j = n; i <= j; j--) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void spira(int n) {
    	System.out.println("�Ƕ�̵� ���");
        for (int i = 1; i <= n; i++) {                     // i�� (i = 1, 2, �� ,n)
            for (int j = 1; j <= n - i + 1; j++)         // n-i+1���� ' '�� ��Ÿ��
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)     // (i-1)*2+1���� '*'�� ��Ÿ��
                System.out.print('*');
            System.out.println();                         // ����(�ٺ�ȯ)
        }
    }
    static void npira(int n) {
    	System.out.println("���� �Ƕ�̵� ���");
        for (int i = 1; i <= n; i++) {                     // i�� (i = 1, 2, �� ,n)
            for (int j = 1; j <= n - i + 1; j++)         // n-i+1���� ' '�� ��Ÿ��
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)     // (i-1)*2+1���� '*'�� ��Ÿ��
                System.out.print(i % 10);
            System.out.println();                         // ����(�ٺ�ȯ)
        }
    }

}
