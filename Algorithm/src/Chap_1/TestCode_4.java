package Chap_1;

import java.util.Scanner;

public class TestCode_4 {
	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        System.out.println("삼각형 모양으로 나타냅니다.");
 
        do {
            System.out.print("단수는 ：");
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
        System.out.println("왼쪽 아래가 직각인 삼각형");
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void b(int n) {
        System.out.println("왼쪽 위가 직각인 삼각형");
        for (int i = n; i > 0; i--) {
            for (int j = i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void c(int n) {
        System.out.println("오른쪽 위가 직각인 삼각형");
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
        System.out.println("오른쪽 아래가 직각인 삼각형");
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
    	System.out.println("피라미드 모양");
        for (int i = 1; i <= n; i++) {                     // i행 (i = 1, 2, … ,n)
            for (int j = 1; j <= n - i + 1; j++)         // n-i+1개의 ' '를 나타냄
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)     // (i-1)*2+1개의 '*'를 나타냄
                System.out.print('*');
            System.out.println();                         // 개행(줄변환)
        }
    }
    static void npira(int n) {
    	System.out.println("숫자 피라미드 모양");
        for (int i = 1; i <= n; i++) {                     // i행 (i = 1, 2, … ,n)
            for (int j = 1; j <= n - i + 1; j++)         // n-i+1개의 ' '를 나타냄
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)     // (i-1)*2+1개의 '*'를 나타냄
                System.out.print(i % 10);
            System.out.println();                         // 개행(줄변환)
        }
    }

}
