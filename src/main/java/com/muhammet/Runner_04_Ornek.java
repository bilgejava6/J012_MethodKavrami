package com.muhammet;

public class Runner_04_Ornek {
    static int s4; // 0
    int s5;
    public static void main(String[] args) {
        int s1=21,s2=212,s3=98; // local variable
        System.out.println("s1....: "+ s1);
        System.out.println("s2....: "+ s2);
        System.out.println("s3....: "+ s3);
        System.out.println("s4....: "+ s4);
        /**
         * bu sınıftan bir nesne yaratıp bellekte adresliyor.
         */
        Runner_04_Ornek or = new Runner_04_Ornek();
        or.goruntule();
    }// end main

    public void goruntule(){
        int t=0;
        System.out.println(t);
        System.out.println("s5.....: "+ s5);
    }
}// end class
