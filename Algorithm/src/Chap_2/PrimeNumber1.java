package Chap_2;

public class PrimeNumber1 {
	//1000 ÀÌÇÏÀÇ ¼ö¼Ò¸¦ ¿­°Å(¹öÀü1)
	
	public static void main(String[] args) {
		int counter = 0; // ³ª´°¼ÀÀÇ È½¼ö
		
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
		System.out.println("³ª´°¼ÀÀ» ¼öÇàÇÑ È½¼ö : " + counter);
	}
}
