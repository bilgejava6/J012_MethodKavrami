package com.muhammet;

public class Runner_01_Void_NoParameter {
    // bir class içerisinde, Method,Değişken,İnner Class tanımlanabilir.

    /**
     *
     * Gereksiz Kod tekrarının önüne geçer, kod revizyonlarının
     * hızlı ve kolay bir şekilde  yapışmasını sağlar.
     * DEV(developer)-OPS(operations) / docker, kubernetes, pipeline, CI/CD, cloud
     */
    public static void main(String[] args) {
        System.out.println("BAŞLADI.");
        // 500 adet
        ekranaYaz();

        System.out.println("bazı kodlar çalıştı");

        ekranaYaz();


        ekranaYaz();


        ekranaYaz();

        System.out.println("BİTTİ.");
    }// end main method

    //DİKKAT!! static methodlar; statik değişken ve methodlar ile çalışır.
    public static void ekranaYaz(){
        System.out.println("""
                ****************************
                ****      ARI MEDYA      ***
                ****************************
                """);
    }

}//end class
