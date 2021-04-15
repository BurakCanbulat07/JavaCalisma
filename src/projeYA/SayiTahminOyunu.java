package projeYA;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {
		int cevap=0;
		int win=0;
		int lose=0;
		Scanner scan = new Scanner(System.in);
		 do {
			 Random r=new Random();
			 int sayi=r.nextInt(100);
		 System.out.println("0 ile 100 arasinda bir sayi tuttum.\nBakalim bulabilecek misin?");
		 
		 int hak=10;

		 do {
			System.out.println("Tahmin etmek icin "+hak+" hakkin var");
			cevap=scan.nextInt();
			if (sayi>cevap&&sayi>=0&&sayi<=100) {
				System.out.println("Kucuk");
			}else if (sayi<cevap&&sayi>=0&&sayi<=100) {
				System.out.println("Buyuk");
			}else if (sayi==cevap) {
				System.out.println("Bildin! \n"+"Cevap: "+cevap);
				win++;
				break;
			}else {
				System.out.println("Girdigin sayi 0 ile 100 arasinda degil");
			}
			hak--;
		} while (hak>0);
		 if (hak==0) {
			System.out.println("Bulamadin.\nHaklarin bitti :(");
			lose++;
		}
		 boolean flag=false;
		 do {
		 flag=false;
		 System.out.println("Tekrar oynamak ister misin? E/H");
		 int tekrar=scan.next().toUpperCase().charAt(0);
		 if (tekrar=='E') {
			 System.out.println("========================================================================================================");
			break;
		}else if (tekrar=='H') {
			flag=true;
			break;
		}else {
			System.out.println("Gecersiz karakter");
		}
		}while(true);
		 if (flag==true) {
			break;
		}
		 }while(true);
		 System.out.println("Oyun bitti\nToplam zafer: "+win);
		 System.out.println("Toplam yenilgi: "+lose);
		 scan.close();}
}
