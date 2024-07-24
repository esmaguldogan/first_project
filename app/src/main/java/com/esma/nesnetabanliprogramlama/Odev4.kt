package com.esma.nesnetabanliprogramlama

class Odev4 {

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