package com.muhammet;

import java.util.Scanner;

public class Runner_02_Ornek {

    public static void main(String[] args) {
        ekranaYaz();
        switch (secimYap()){
            case 1: toplamaYap(); break;
            case 2: cikartmaYap(); break;
            case 3: carpmaYap(); break;
            default:
                System.out.println("Yanlış seçim");break;
        }
        System.out.println("KOD BİTTİ");
    }// end main method

    public static void ekranaYaz(){
        System.out.println("""
                ***** İşlemler *****
                1- Toplama
                2- Çıkartma
                3- Çarpma
                """);
    }
    public static void toplamaYap(){
        int s1 = sayiAl();
        int s2 = sayiAl();
        int toplam = s1 + s2;
        System.out.println("iki sayının toplamı...: "+ toplam);
    }
    public static void cikartmaYap(){
        int s1 = sayiAl();
        int s2 = sayiAl();
        int fark = s1 - s2;
        System.out.println("iki sayının farkı...: "+ fark);
    }
    public static void carpmaYap(){
        int s1 = sayiAl();
        int s2 = sayiAl();
        int carpim = s1 * s2;
        System.out.println("iki sayının çarpımı...: "+ carpim);
    }
    public static int secimYap(){
        System.out.print("Lütfen seçiniz....: ");
        int secim = new Scanner(System.in).nextInt();
        return secim;
    }
    public static int sayiAl(){
        System.out.print("sayı giriniz....: ");
        int sayi = new Scanner(System.in).nextInt();
        return sayi;
    }
}
