package com.muhammet;

public class Runner_99_Soru1 {
    public static void main(String[] args) {
        /**
         * KOLAY:
         * 1- iki sayı alarak sayılardan büyük olanı bulan ve ekrana yazdıran
         * geriye değer döndürmeyen bir method yazınız.
         *
         * 2- 3 adet sayı değeri alan ve sayılardan en büyük 2 tanesinin farkının
         * en küçük sayıdan büyük olup olmadığını dönen method u yazınız
         *
         * 3- iki String ifade alarak, 1. ifadenin içerisinde 2. ifadenin
         * yer alıp almadığını dönen method u yazınız.
         * "buhün hava güneşli ancak soğuk idi.", "hava"
         *
         * 4- bir String ifade alan ve ifadenin ilk ve son harflerini
         * dönen method u yazınız.
         * > muhammet hoca
         * çıktı: ma
         * ZOR:
         * bir ifade alan ve bu ifadenin kelimelerini ters çevirerek
         * String bir değer olarak dönen kodu yazınız.
         */
        System.out.println(cevap4("muhammet hoca nerede"));
    }// end main

    public static void cevap1(int s1, int s2){
        if(s1>s2) System.out.println("Büyük sayı...: "+ s1);
        else      System.out.println("en büyük sayı....: "+ s2);
    }
    public static void cevap1A(int s1, int s2){
        if(s1>s2){
            System.out.println("Büyük sayı...: "+ s1);
            return;
        }
        System.out.println("en büyük sayı....: "+ s2);
    }
    public static boolean cevap2(int s1, int s2, int s3){
        int enb = s1, enk= s1, ort=s1;
        if(s2>enb) enb = s2;
        else if(s3>enb) enb = s3;
        if(s2<enb) enk = s2;
        else if(s3<enb) enk = s3;
        if(s2!=enb && s2 !=enk) ort=s2;
        else if(s3!=enb && s3!=enk) ort=s3;
        System.out.println("enb....: "+ enb);
        System.out.println("enk....: "+ enk);
        System.out.println("ort....: "+ ort);
        int fark = enb - ort;
        return fark>enk;
    }
    public static boolean cevap3(String ifade, String aranan){
        boolean varMi = false;
        if(ifade.toLowerCase().contains(aranan.toLowerCase()))
            varMi = true;
        return varMi;
    }
    public static boolean cevap3A(String ifade, String aranan){
       return  ifade.toLowerCase().contains(aranan.toLowerCase());
    }
    public static String cevap4(String ifade){
        String sonuc = "";
        char ilkDeger = ifade.charAt(0);
        char sonDeger = ifade.charAt(ifade.length()-1);
        sonuc += ilkDeger;
        sonuc += sonDeger;
        return sonuc;
    }

}// end class
