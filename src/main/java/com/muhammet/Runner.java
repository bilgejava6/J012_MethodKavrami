package com.muhammet;

public class Runner {
    public static void main(String[] args) {


    } // end main method

    /**
     * Method Tanımlama
     * --> görev yerine getiren ve görevin türüne göre bilgi talep eden, görev
     * bittiğinde duruma göre geri bildirimde bulunan yada bulunmayan işlevsel
     * kod yapılarıdır.
     * public -> Access Modifier (Erişim Belirteci), zorunlu değil
     * static -> Zorunlu değil
     * final -> Zorunlu değil
     * (Object)Return Type -> herhangi bir değişken olarak tanımlanabilir ya da void tipinde olabilir.
     * Method Name -> görev yapısının adıdır. Genellikle yapacağı görev ile doğru orantılı olarak tanımlanır.
     * ()Parantezler -> bu kısımda method un işlem gerçekleştirirken ihtiyaç duyacağı öğreleri almak için
     * kullanırız.
     * {} Method Body-> methodun görevini yerine getirdiği kodlamların olduğu alandır.
     * return -> method eğer bir görev sonunda bilgi vermek istiyor ise tanımlandığı ReturnType a uygun bir şekilde
     * cevap döner, dönüş yapabilmek için de bu anahtar kelimeyi kullanır.
     */
    public static final Object toplamaIslemiYap(String gorevDetay, int sayi1, int sayi2, char devamDurumu,
                                                Object genelTanim, boolean zorunluMu, String[] diziler){
        int toplam = sayi1 + sayi2;
        System.out.println("Burada işlemler oluyor.");
        return "Deneme";
    }

}// end class