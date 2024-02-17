package com.esma.myapplicationkotlin

import java.util.Scanner

fun main() {

    val paralar = arrayOf<Int>(30,-45,80,120,-23,44,234,-499)

    var toplam = 0

    for (kalan in paralar){
        toplam = toplam + kalan
    }
    if (toplam<=0) {
        println("Borç: $toplam")

        val girdi = Scanner(System.`in`)

        println("Borcunuzu ödeyiniz")

        val borc = girdi.nextInt()
    }
    else
        println("Kalan: $toplam")


}
