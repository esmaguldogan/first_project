package com.esma.myapplicationkotlin

import java.util.Scanner

fun main() {

    println("Giriniz")

    val girdi = Scanner(System.`in`)
     val ad = girdi.next()

    val sayi = girdi.nextInt()
    println("Sonuc: $sayi")



}