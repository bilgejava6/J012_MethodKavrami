package com.muhammet;

import java.util.Scanner;

public class Runner_03_ReturnType_Parameter {

    public static void main(String[] args) {
        System.out.println("""
                **** ALAN HESAPLAMA ***
                """);
        System.out.print("taban uzunluğu giriniz...: ");
        int t = new Scanner(System.in).nextInt();
        System.out.print("yükseklik giriniz........: ");
        int y = new Scanner(System.in).nextInt();
        double alan = ucgeninAlaniniHesapla(y,t);
        System.out.println("alan.....: "+ alan);
        ucgeninAlaniniHesapla(5,9);
    }// end main method

    /**
     * Hem geri dönüş tipi olan hemde parametre talep eden methodlar
     */
    public static double ucgeninAlaniniHesapla(int yukseklik, int tabanUzunlugu){
        double alan = (yukseklik * tabanUzunlugu) / 2d;
        return alan;
    }

}// end class
