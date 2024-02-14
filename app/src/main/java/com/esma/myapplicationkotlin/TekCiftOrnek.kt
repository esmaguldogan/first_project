package com.esma.myapplicationkotlin

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)

    while(true){
        println("Sayı giriniz")

        val sayi = girdi.nextInt()
        val sonuc = sayi % 2 // "%" bir sayıyı ikiye bölünce sonuç sıfırsa çift sayı, sonuç birse tek sayı olduğunu ifade eder.

        if (sonuc == 0) {
            println("Çift sayı")
        }
        if (sonuc==1) {
            println("Tek sayı")
        }
        println("Çıkış yapmak için (1) - Devam etnek için diğer sayılar")

        val cikis = girdi.nextInt()

        if (cikis==1){
            println("Çıkış yapıldı")
            break
        }
    }

}