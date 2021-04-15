package Math;

public class S3_1_100Toplami {
public static void main(String[] args) {
	//Soru 3: 1 ile 100 arasindaki sayilarin toplamini 
	//ekrana yazan programi Java dilinde yaziniz
	
	int toplam=0;
	for (int i=1;i<=100;i++) {
		toplam+=i;
	}
		System.out.println("1 ile 100 arasindaki sayilarin toplami: "+toplam);
}
}
