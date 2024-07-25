package com.esma.nesnetabanliprogramlama

class Odev7 {
 //Parametre	olarak	girilen	kota	miktarına	göre	ücreti	hesaplayarak	geri	döndüren	 metodu	yazınız.
 //50GB	100	TL
 //Kota	aşımından	sonra	her	1GB	4	TL
    fun InternetHesaplama(GB:Int):Int{
        var ucret = 0

        if(GB>50) {
            val kotaFazlasi = GB - 50
            ucret = 100 + kotaFazlasi*4


        }else{
            ucret = 100

        }
        return ucret
    }
}

