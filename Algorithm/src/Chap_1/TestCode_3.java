package Chap_1;

import java.util.Scanner;

public class TestCode_3 {
	public static void main(String[] args) {
//		for (int i = 1; i < 10; i++) {
//			System.out.printf("%3d",i);
//		}
//		System.out.println();
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%3d",i*j);
//			}
//			System.out.println();
//			System.out.printf("%3d", i);
//			System.out.print(" | ");
//		}
		 System.out.println(" | 1  2  3  4  5  6  7  8  9");
	        System.out.println("-+---------------------------");
	        for (int i=1;i<10;i++) {
	            System.out.print(i+"|");
	            for (int j=1;j<10;j++) {
	                System.out.printf("%3d", i*j);
	            }
	            System.out.println();
	        }
	        
			 System.out.println(" | 1  2  3  4  5  6  7  8  9");
		        System.out.println("-+---------------------------");
		        for (int i=1;i<10;i++) {
		            System.out.print(i+"|");
		            for (int j=1;j<10;j++) {
		                System.out.printf("%3d", i+j);
		            }
		            System.out.println();
		        }
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("사각형을 출력합니다.");
		   int n = scanner.nextInt();		   
		   System.out.println("단 수"+ n);

		   for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.printf("%2s","*");
			}
			System.out.println();
		}

	}
}
