package com.muhammet;

import java.util.Scanner;

public class Runner_04_Scope {
    /**
     * Gövdesi olan her ahngi bir kod bloğunun {} leri içerisi onun
     * scope u dur. Ancak özel durumlarda belli koşullar altında değişkenler
     * scope dışından erişilebilirler. Ancak değişkenlerin varlıkları kendi
     * scope ları içerisindedir.
     * Class içinde tanımlanan değişkenler içerisindeki tüm methodlarda
     * erişilebilir olur.
     * DİKKAT!!! statik methodlar sadece statik değişkenler ile çalışır.
     * neden? çünkü static olan tüm tanımlar uygulama derlenmeden önce
     * belleklenirler. yani adresleri atanır.
     *
     */
    int sayi;
    String ifade;
    static Scanner sc;
    static String deger;
    static double fiyat;

    public static void main(String[] args) {
        fiyat = 123d;
        Runner_04_Scope sp = new Runner_04_Scope();
        sp.sayi = 45;
        int s1=0,s2=0;
        int toplam = s1+s2;
        deger2 = 4;

    }// end main method

    public void deneme(){
        deger3 = 34;
        deger2 = 34;
        int toplam = deger3+deger2;
        for (int i = 0; i < toplam; i++) {
            System.out.println(deger+ "  i...: "+ i);
        }
        int i=0;
        if(i>20){
            System.out.println("fsdfds");
        }
    }

   static int deger2;
   int deger3;
}// end class
