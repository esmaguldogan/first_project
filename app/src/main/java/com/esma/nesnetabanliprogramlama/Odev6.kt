package com.esma.nesnetabanliprogramlama

class Odev6 {
    //Parametre	olarak	girilen	gün	sayısına	göre	maaş	hesabı	yapan	ve	elde	edilen	 değeri	geri	döndüren	metod yazınız.
    //1	Günde	8	saat	çalışılabilir.
    //Çalışma	saat	ücreti	:	10	tl
    //Mesai	saat	ücreti	:	20tl
    //160	saat	üzeri	mesai	sayılır

    fun MaasHesaplama(günSayisi:Int):Int{
        val calismaSaati = günSayisi * 8
        println("Çalışma Saati: $calismaSaati")

        var maas = 0

        if(calismaSaati>160) {
            val mesaiFazlasi = calismaSaati - 160
            maas = 160 * 10 + mesaiFazlasi * 20

        }else{
            maas = calismaSaati * 10

            }
        return maas
        }
    }
