package com.esma.nesnetabanliprogramlama

fun main () {

    val bmw = Araba("kırmızı", 10, false)

    bmw.bilgiAl()

    bmw.hiz = 900
    bmw.calisiyormu = true
    bmw.renk = "beyaz"

    bmw.bilgiAl()

    bmw.durdur()
    bmw.bilgiAl()

    bmw.calistir()
    bmw.bilgiAl()

    bmw.hizlan(100)
    bmw.bilgiAl()

    bmw.yavasla(98)
    bmw.bilgiAl()

    val sahin = Araba("sarı", 100, true)
    sahin.bilgiAl()

    sahin.hizlan(100)
    sahin.bilgiAl()

    sahin.durdur()
    sahin.bilgiAl()
}



