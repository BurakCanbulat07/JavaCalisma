package projeYA;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Random r = new Random();
		System.out.println("Tas-Kagit-Makas oyununa hosgeldin!");
		System.out.println("Cikmak icin 'Q' ya bas");
		int me=0;
		int com=0;
		do{
		System.out.println("T=Tas / K=Kagit / M=Makas");
		int sayi = r.nextInt(90);
		
		char harf='a';
		
		if (sayi>=60&&sayi<=90) {
			harf='T';
		}else if (sayi>=30&&sayi<60) {
			harf='K';
		}else if (sayi>=0&&sayi<30) {
			harf='M';
		}
	
		System.out.println("Sec");
		char secim=scan.next().toUpperCase().charAt(0);
		System.out.println("Sen");
		if (secim=='T') {
			System.out.println("   ,  ____/^^______,");
			System.out.println(" .   /             |");
			System.out.println("    /  .        /  |");
			System.out.println("   /      /_       >");
			System.out.println("  |.               |");
			System.out.println("  <     ,          /");
			System.out.println("  |_______________/ ");
		}else if (secim=='K') {
			System.out.println("     _____       __ ");
			System.out.println(" ~~ /     >_____/  >");
			System.out.println("~  /               |");
			System.out.println("  |      _______/  |");
			System.out.println("  |   .          _/ ");
			System.out.println("~ <______       /   ");
			System.out.println("  ~~     <_____/    ");
		}else if (secim=='M') {
			System.out.println(" ________     /^^^^}");
			System.out.println("/        |   /  @  }");
			System.out.println("|______   }_/ ____/ ");
			System.out.println(" ______}__/ } _____ ");
			System.out.println("|         __/      }");
			System.out.println(" <_______|  {   @  }");
			System.out.println("             {_____/ ");
		}else if (secim=='Q') {
			break;
		}else {
			System.out.println("gecersiz harf");
			continue;
		}
		System.out.println("=======================================");
		System.out.println("Bilgisayar");
		if (harf=='T') {
			System.out.println("   ,  ____/^^______,");
			System.out.println(" .   /             |");
			System.out.println("    /  .        /  |");
			System.out.println("   /      /_       >");
			System.out.println("  |.               |");
			System.out.println("  <     ,          /");
			System.out.println("  |_______________/ ");
		}else if (harf=='K') {
			System.out.println("     _____       __ ");
			System.out.println(" ~~ /     >_____/  >");
			System.out.println("~  /               |");
			System.out.println("  |      _______/  |");
			System.out.println("  |   .         __/ ");
			System.out.println("~ <______      /    ");
			System.out.println("  ~~     <_____|    ");
		}else if (harf=='M') {
			System.out.println(" ________     /^^^^}");
			System.out.println("/        |   /  @  }");
			System.out.println("|______   }_/ ____/ ");
			System.out.println(" ______}__/ } _____ ");
			System.out.println("|         __/      }");
			System.out.println(" <_______|  {   @  }");
			System.out.println("             {_____/ ");
		}
		
		if (secim=='T'&&harf=='M') {
			System.out.println("Sen Kazandin");
			me++;
		}else if (secim=='M'&&harf=='K') {
			System.out.println("Sen Kazandin");
			me++;
		}else if (secim=='K'&&harf=='T') {
			System.out.println("Sen Kazandin");
			me++;
		}else if (harf=='T'&&secim=='M') {
			System.out.println("Bilgisayar Kazandi");
			com++;
		}else if (harf=='M'&&secim=='K') {
			System.out.println("Bilgisayar Kazandi");
			com++;
		}else if (harf=='K'&&secim=='T') {
			System.out.println("Bilgisayar Kazandi");
			com++;
		}else if (harf==secim) {
			System.out.println("Berabere");
		}
		
		System.out.println();
		 }while(true);
		System.out.println("=====================================================================================================================================================");
		System.out.println("                                         Oyun Bitti");
		System.out.println();
		System.out.println("Senin puanin: "+me);
		System.out.println("Bilgisayarin puani: "+com);
	scan.close();}
}
