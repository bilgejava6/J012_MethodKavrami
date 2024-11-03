package com.muhammet;

public class Runner_06_Varargs {
    public static void main(String[] args) {
        /**
         * içerisine 2 adet değer talep eden ve bu değerleri toplayıp sonucunu dönen
         * toplama methodunu yazınız.
         * içerisine 50 adet sayı alan ve toplamını geri dönen method yazınız.
         */
        int[] sayiDizisi = {6,10,9,4,21,41,8,7,43};
        System.out.println("dizinin toplamı....: "+ toplama(sayiDizisi));

        System.out.println("dizinin toplamı....: "+
                toplamaVarargs(2,7,9,98));

    }

    public static int toplamaVarargs(int... sayilar){
        int toplam= 0;
        for (int i=0;i<sayilar.length;i++){
            toplam += sayilar[i];
        }
        return toplam;
    }

    public static int toplama(int[] sayilar){
        int toplam = 0;
        for(int i=0;i<sayilar.length;i++){
            toplam += sayilar[i];
        }
        return toplam;
    }

    public static int toplama(int s1, int s2){
        int toplam = s1 + s2;
        return toplam;
    }

}
