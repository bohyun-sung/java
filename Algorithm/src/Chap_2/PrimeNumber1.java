package Chap_2;

public class PrimeNumber1 {
	//1000 ������ ���Ҹ� ����(����1)
	
	public static void main(String[] args) {
		int counter = 0; // �������� Ƚ��
		
		for (int n = 2; n <= 1000; n++) {
			int i;
			for (i = 2; i < n; i++) {
				counter++;
				if (n % n == 0) {
					break;
				}
			}
			if(n == i)
				System.out.println(n);
		}
		System.out.println("�������� ������ Ƚ�� : " + counter);
	}
}
