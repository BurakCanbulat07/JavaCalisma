package Math;

import java.util.Scanner;

public class S2_AltiSayininToplami {
	public static void main(String[] args) {
		//Klavyeden girilen 6 tane sayinin toplamini 
		//ekrana yazan programi Java dilinde yaziniz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1.sayiyi giriniz");
		double sayi1=scan.nextDouble();
		System.out.println("2.sayiyi giriniz");
		double sayi2=scan.nextDouble();
		System.out.println("3.sayiyi giriniz");
		double sayi3=scan.nextDouble();
		System.out.println("4.sayiyi giriniz");
		double sayi4=scan.nextDouble();
		System.out.println("5.sayiyi giriniz");
		double sayi5=scan.nextDouble();
		System.out.println("6.sayiyi giriniz");
		double sayi6=scan.nextDouble();
		
		System.out.println("Girdiginiz sayilarin toplami: "+(sayi1+sayi2+sayi3+sayi4+sayi5+sayi6));
		scan.close();
	}

}
