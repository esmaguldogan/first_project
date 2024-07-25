package com.esma.nesnetabanliprogramlama

class Odev3 {

    //Parametre	olarak	girilen	sayının	faktoriyel değerini	hesaplayıp	geri
    //döndüren	metodu	yazınız.
    fun faktoriyelHesaplama (sayi:Int):Int {
        var sonuc = 1

        for (i in 1..sayi) {
        sonuc = sonuc * i
        }
        return sonuc
    }
}
