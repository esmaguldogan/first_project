package com.esma.myapplicationkotlin

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)

    val isimler = Array<String>(5){""} //{"","","","",""}

    for (i in 0 until isimler.count()) { // 0,1,2,3,4

        println("${i+1}.İsim giriniz")

        val isim = girdi.next()
        isimler[i] = isim
    }

    for((indeks,isim) in isimler.withIndex()) {
        println("${indeks + 1}.isim: $isim")
    }
}

