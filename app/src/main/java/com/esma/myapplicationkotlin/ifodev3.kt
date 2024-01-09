package com.esma.myapplicationkotlin

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    println("Birinci kenarı giriniz")

    val kenar1 = girdi.nextInt()
    println("Birinci kenar : $kenar1")

    println("İkinci kenarı giriniz")

    val kenar2 = girdi.nextInt()
    println("İkinci kenar: $kenar2")

    println("Üçüncü kenarı giriniz")

    val kenar3 = girdi.nextInt()
    println("Üçüncü kenar: $kenar3")

    if (kenar1 == kenar2 && kenar2 == kenar3)
        println("Eşkenar Üçgen")

    else if (kenar1 == kenar2 || kenar2 == kenar3 || kenar1 == kenar3)
        println("İkizkenar Üçgen")

    else
        println("Çeşitkenar Üçgen")


}