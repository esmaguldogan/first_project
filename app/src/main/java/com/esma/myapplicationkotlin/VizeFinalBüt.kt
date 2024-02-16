package com.esma.myapplicationkotlin

import java.util.Scanner

fun main() {

    val elemanlar = arrayOf<String>("Vize1", "Vize2", "Final", "Büt")
    val notlar = arrayOf<Int>(4)

    var girdi = Scanner(System.`in`)

    for (eleman in elemanlar) {
        println("$eleman ' giriniz")

    val notlar = girdi.nextInt()
    }

    var toplam = 0

    for (i in 1 until notlar.count()) {
        println("${elemanlar[i]} : ${notlar[i]}")
        toplam = toplam + notlar[i]
    }

    val ortalama = toplam/notlar.count()
    println("Ortalama: $ortalama")

}



