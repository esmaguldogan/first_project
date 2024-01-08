package com.esma.myapplicationkotlin

import java.util.Scanner

fun main () {

    val girdi = Scanner(System.`in`)

    println("DikdörtgenAlani (1)")
    println("ÇemberAlani (2)")

    val secim = girdi.next()
    println("Seçiminiz : $secim")

    if (secim.toInt() == 1)
        println("Kısa kenar giriniz")

    val kisakenar = girdi.next()
        println("Uzun kenar giriniz")
    val uzunkenar = girdi.next()
        println("Dikdörtgen alanı")
    val dikdortgenAlani = uzunkenar + kisakenar
        println("Dikdörtgen alanı: $dikdortgenAlani")
    
    if(secim.toInt() == 2)
        println("Yarı çap giriniz")
        val yaricap = girdi.next()
        println("Çember alanı")
    val cemberalani = 3.14
    println("Sonuç: $cemberalani")





}