package com.muhammet;

import java.util.Scanner;

public class Runner_BooleanArray_Ornek {
    static  boolean[] ogrenciDurumu = new boolean[20];
    static  String[] ogrenciListesi = {
            "Ali Yılmaz",
            "Ayşe Demir",
            "Mehmet Öz",
            "Fatma Kara",
            "Ahmet Çelik",
            "Elif Aksoy",
            "Mustafa Şahin",
            "Zeynep Güneş",
            "Hüseyin Koç",
            "Emine Taş",
            "Canan Kaya",
            "İbrahim Arslan",
            "Selin Bulut",
            "Oğuz Polat",
            "Sevgi Aydın",
            "Eren Şen",
            "Yasemin Çiçek",
            "Barış Deniz",
            "Gökhan Kılıç",
            "Nuray Doğan"
    };
    static int[][] notlar = {
            {85, 90},  // 1. öğrenci
            {78, 82},  // 2. öğrenci
            {2, 88},  // 3. öğrenci
            {74, 76},  // 4. öğrenci
            {88, 91},  // 5. öğrenci
            {67, 70},  // 6. öğrenci
            {90, 5},  // 7. öğrenci
            {83, 85},  // 8. öğrenci
            {76, 80},  // 9. öğrenci
            {89, 92},  // 10. öğrenci
            {81, 84},  // 11. öğrenci
            {7, 75},  // 12. öğrenci
            {91, 93},  // 13. öğrenci
            {68, 4},  // 14. öğrenci
            {77, 79},  // 15. öğrenci
            {86, 87},  // 16. öğrenci
            {93, 90},  // 17. öğrenci
            {72, 78},  // 18. öğrenci
            {4, 6},  // 19. öğrenci
            {88, 89}   // 20. öğrenci
    };

    public static void main(String[] args) {
        /**
         * bir okulda öğrencilerin yıl sonu notları verilmiş ve okul u geçen
         * geçemeyen öğrencilere göre diplomaları dağıtılacaktır.
         * Aşağıda öğrencilerin notları otomatik olarak belirlenmiş ve
         * bir liste içerisine eklenmiştir.
         * Buna göre öğrencilerin geçti/kaldı durumuna göre karne alıp
         * alamayacaklarını bulan bir kodlama yapınız.
          */
        notHesapla();
        init();
    }// end main method

    public static void init(){
        System.out.println("""
                **************************
                1- Öğrenci Listesi
                2- Not Listesi
                3- Geçti/Kaldı Listesi
                4- Arama
                0- ÇIKIŞ
                """);
        System.out.print("seçiniz....: ");
        int secim = new Scanner(System.in).nextInt();
        switch (secim){
            case 1: ogrenciListesi(); break;
            case 2: notListesi(); break;
            case 3: diplomaListesi(); break;
            case 4: arama(); break;
            case 0:
                System.out.println("ÇIKIŞ YAPILDI"); break;
            default:
                System.out.println("lütfen geçerli bir seçim yapınız."); break;
        }
    } // end init
    public static void ogrenciListesi(){
        System.out.println("""
                ***** Öğrenic Listesi ******
                """);
        for(int i=0;i<ogrenciListesi.length;i++)
            System.out.println(i+1+". öğrenci....: "+ ogrenciListesi[i]);
    } // end ogrenciListesi
    public static void notListesi(){
        System.out.println("""
                    ***** Öğrenic Not Listesi ******
                    """);
        for (int i=0;i<ogrenciListesi.length;i++){
            System.out.print("Ad....: "+ogrenciListesi[i]);
            System.out.print(" 1. not..: "+ notlar[i][0]);
            System.out.print(" 2. not..: "+ notlar[i][1]);
            System.out.println();
        }
    }// end notlistesi
    public static void diplomaListesi(){
            for (int i=0;i<ogrenciListesi.length;i++){
                System.out.println("öğrenci...........: "+ ogrenciListesi[i]);
                System.out.println("öğrenic durumu....: "+
                        (ogrenciDurumu[i] ? "GEÇTİ" : "KALDI")
                );
                System.out.println("-------------------------");
            }
    }// end diplomalistesi
    public static void arama(){

    } // end arama
    public static void notHesapla(){
        for (int i=0;i<ogrenciDurumu.length;i++){
            int not1 = notlar[i][0];// 2
            int not2 = notlar[i][1];// 88
            int ortalama = (not1 + not2)/2; // 45
            boolean gectiMi = ortalama>=50; // false
            ogrenciDurumu[i] = gectiMi;
        }
    }
}//end class
