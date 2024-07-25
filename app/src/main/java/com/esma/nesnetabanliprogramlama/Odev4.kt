package com.esma.nesnetabanliprogramlama

class Odev4 {

    //Parametre	olarak	girilen	kelime	ve	harf	için	harfin	kelime	içinde	kaç
    //adet	olduğunu	gösteren	bir	metod yazınız.
    fun KelimeAdeti(kelime:String, harf: Char){
        var sonuc = 0

        for (k in kelime) {// a k s a r a y
            if (k == harf) {
                sonuc = sonuc + 1
            }
        }
        println("Harf Adeti: $sonuc")
    }
}