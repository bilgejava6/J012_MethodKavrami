package com.muhammet;

import java.util.Scanner;

public class Runner_01_Ornek {

    public static void main(String[] args) {
        ekranaYaz();
        System.out.print("lütfen seçiniz.....: ");
        int secim = new Scanner(System.in).nextInt();
        switch (secim){
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
        System.out.print("1. sayıyı giriniz...: ");
        int s1 = new Scanner(System.in).nextInt();
        System.out.print("2. sayıyı giriniz...: ");
        int s2 = new Scanner(System.in).nextInt();
        int toplam = s1 + s2;
        System.out.println("iki sayının toplamı...: "+ toplam);
    }
    public static void cikartmaYap(){
        System.out.print("1. sayıyı giriniz...: ");
        int s1 = new Scanner(System.in).nextInt();
        System.out.print("2. sayıyı giriniz...: ");
        int s2 = new Scanner(System.in).nextInt();
        int fark = s1 - s2;
        System.out.println("iki sayının farkı...: "+ fark);
    }
    public static void carpmaYap(){
        System.out.print("1. sayıyı giriniz...: ");
        int s1 = new Scanner(System.in).nextInt();
        System.out.print("2. sayıyı giriniz...: ");
        int s2 = new Scanner(System.in).nextInt();
        int carpim = s1 * s2;
        System.out.println("iki sayının çarpımı...: "+ carpim);
    }

}// end class
