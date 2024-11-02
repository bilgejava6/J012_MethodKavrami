package com.muhammet;

import java.util.Scanner;

public class Runner_02_ReturnType_NoParameter {
    public static void main(String[] args) {

        int s1,s2,toplam;
        s1 = kullanicidanBirSayiAl();
        s2 = kullanicidanBirSayiAl();
        toplam = s1 + s2;
        System.out.println("Toplam....: "+ toplam);
    }// end main method

    public static int kullanicidanBirSayiAl(){
        System.out.print("bir sayi giriniz....: ");
        int sayi = new Scanner(System.in).nextInt();
        /**
         * return methodun ReturnType ı ne ise buna uygun bir değeri döner.
         * return ifadesi bu methodun sonlandığını ifade eder, bu nedenle
         * return []; ifadesinden sonra kodlama yapılmaz. çünkü method sonlanmıştır.
         */
        return sayi;
    }

}// end class
