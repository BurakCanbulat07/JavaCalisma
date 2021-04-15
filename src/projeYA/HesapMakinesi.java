package projeYA;

import java.util.Scanner;

public class HesapMakinesi {
	public static void main(String[] args) {
		System.out.println("+ = toplama\n- = cikarma\n* = carpma\n/ = bolme\n^ = us");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		do {
		System.out.println("1. sayiyi girin");
		int s1=scan.nextInt();
		int sayi=s1;
		System.out.println("Islemi girin");
		char i =scan.next().charAt(0);
		System.out.println("2. sayiyi girin");
		int s2=scan.nextInt();
		
		if (i=='+') {
			System.out.println("Sonuc: "+(s1+s2));
		}else if (i=='-') {
			System.out.println("Sonuc: "+(s1-s2));
		}else if (i=='*') {
			System.out.println("Sonuc: "+(s1*s2));
		}else if (i=='/') {
			try {
				System.out.println("Sonuc: "+(s1/s2));
			} catch (ArithmeticException e) {
				System.out.println("0'a bolemezsin");
			}
		}else if (i=='^') {
			for (int j = 2; j < s2; j++) {
				s1*=sayi;
			}
			System.out.println(s1);
		}else {
			System.out.println("Gecersiz");
		}
		}while(true);
	}

}
