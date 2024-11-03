package com.muhammet;

public class Ruuner_A {

    public static void main(String[] args) {
        Runner_06_Ornek.ifadeyiKes("fsdfdsff",2,4);
    }

    public static void init(){
        System.out.println(karakterAl("selam hocam nasılsınz",4,2));
    }


    /**
     * ifade = "bugün hava güneşli"
     * indexList = 2,6,12
     * sonuc = "ghü"
     */
    public static String karakterAl(String ifade, int... indexList){
        String sonuc = "";
        for(int i=0;i<indexList.length;i++){ // i=3
            int index = indexList[i]; // 12
            char bulunanKarakter =  ifade.charAt(index); // ü
            sonuc += bulunanKarakter;
        }
        return sonuc;
    }

    /**
     * bir String ifade alacak, int tipinde startIndex ve endIndex şeklinde
     * iki değişken alacak. bu method ifadeyiKes adında bir method olacak
     * -- başlangıç değeri bitisten büyük olduğunda uyarı verin ve boş dönün
     * -- başlangıç ya da bitiş ifadenin sınırlarını aştığında uyarı verin ve boş dönün
     *
     * örn: muhammet hoca ile java programlama dersi, 5, 9
     * sonuç: met h
     * --------------
     * örn: muhammet hoca ile java programlama dersi, 9, 2
     * uyarı...: başlangıç bitişten büyük olamaz
     * sonuç: ""
     * -----------
     * örn: muhammet hoca ile java programlama dersi, 900, 2000
     * uyarı...: lütfen sınırlar içinde değer giriniz.
     * sonu: ""
     */

    public static String ifadeyiKes(String ifade, int startIndex, int endIndex){
        String result = null;
        if(startIndex<0 || endIndex<0)
            System.out.println("değereler 0 dan küçük olamaz");
        else if(startIndex>endIndex)
            System.out.println("Başlangıç değeri bitişten büyük olamaz");
        else if(startIndex>ifade.length() || endIndex>ifade.length())
            System.out.println("başlangıç ve bitiş index sınırları aşamaz");
        else
            result = ifade.substring(startIndex,endIndex);
        return result;
    }

}
