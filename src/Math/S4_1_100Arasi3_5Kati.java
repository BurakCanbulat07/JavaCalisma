package Math;

public class S4_1_100Arasi3_5Kati {
//Soru 4: 1 ile 100 arasindaki 3 ve 5 ‘in katlarini 
//ekrana yazan programi Java dilinde yaziniz.
	public static void main(String[] args) {
		for (int i=1;i<=100;i++) {
			if (i%3==0||i%5==0) {
				System.out.print(i+" ");
			}
		}
	}
}
