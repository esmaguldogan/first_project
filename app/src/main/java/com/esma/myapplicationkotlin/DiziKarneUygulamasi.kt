package com.esma.myapplicationkotlin

import java.util.Scanner

fun main(){

    val dersler = Array<String>(5){""}
    val notlar = Array<Int>(5){0}

    val girdi = Scanner(System.`in`)

    for (i in 0 until dersler.count()) {
        println("${i+1}. Dersi Giriniz")
        val ders= girdi.next()
        dersler [i] = ders

        println("${i+1}. Notu Giriniz")
        val not = girdi.nextInt()
        notlar[i] = not
    }
        var toplam = 0
    for (i in 0 until notlar.count()) {
        println("${dersler[i]} : ${notlar[i]}")

        toplam = toplam + notlar[i]
    }

    val ortalama = toplam/notlar.count()
    println("Ortalama: $ortalama")

    if (ortalama>= 50){
        println("GEÇTİ")
    }else{
        println("KALDI")
    }
}
// bu örnek sonuçu for döngüleri ve dizilere biraz daha çalışmam gerektiğini anladım.
