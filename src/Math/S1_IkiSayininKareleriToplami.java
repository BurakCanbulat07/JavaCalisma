package Math;

import java.util.Scanner;

public class S1_IkiSayininKareleriToplami {
	public static void main(String[] args) {
		//Klavyeden rastgelen girilen 2 tane sayinin karelerinin 
		//toplamini ekrana yazan programi Java dilinde yaziniz.
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Iki sayi giriniz");
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		
		System.out.println(sayi1+" sayisinin karesi: "+sayi1*sayi1);
		System.out.println(sayi2+" sayisinin karesi: "+sayi2*sayi2);
		System.out.println((sayi1*sayi1)+" ile "+(sayi2*sayi2)+" sayilarinin toplami: "+((sayi1*sayi1)+(sayi2*sayi2)));
		
		scan.close();
		
	}

}
