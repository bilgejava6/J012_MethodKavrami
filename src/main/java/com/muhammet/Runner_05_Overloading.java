package com.muhammet;

public class Runner_05_Overloading {
    public static void main(String[] args) {
        System.out.println("toplam...: "+ toplam(5,2));
        System.out.println("toplam...: "+ toplam(9d,6d));

    }// end main method
    // bir method aynı ad ile tekrar kullanılamaz, ancak
    // aldığı parmetreler değişirse kullanılabilir
    // buna methosun aşarı yüklenmesi denir.
    public static int toplam(int s1, int s2){
        int t = s1+s2;
        return t;
    }

    public static double toplam(double s1, double s2){
        double t = s1+s2;
        return t;
    }

}// end class
