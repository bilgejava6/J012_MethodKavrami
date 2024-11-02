package com.muhammet;

import java.util.Scanner;

public class Runner_03_Ornek {
    public static void main(String[] args) {
        System.out.print("Araç fiyatı....: ");
        double fiyat = new Scanner(System.in).nextDouble();
        System.out.print("motor hacmi....: ");
        int motor = new Scanner(System.in).nextInt();
        double otvTutari = otvHesapla(fiyat,motor);
        System.out.println("aracın ötv si.....: "+ otvTutari);
        System.out.println("aracın ötv si.....: "+ otvHesapla(fiyat,motor));
    }// end main method

    /**
     * bir araç a ait ötv oranını hesaplayan kod
     */
    public static double otvHesapla(double fiyat, int motorHacmi){
         // 0-1000 -> %50, 1001-1500 -> 80%, 1501-2000 ->110%, 2000+ -> 220%
        double otv = 0;
        if(motorHacmi<=1000)
            otv = fiyat * .5; // 1/2 = 0.5 = .5 = 50%
        else if(motorHacmi<=1500)
            otv = fiyat * .8;
        else if(motorHacmi<=2000)
            otv = fiyat * 1.1;
        else
            otv = fiyat * 2.2;
        return otv;
    }

}// end class
