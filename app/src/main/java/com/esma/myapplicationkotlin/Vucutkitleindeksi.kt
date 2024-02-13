package com.esma.myapplicationkotlin

import java.util.Scanner
fun main(){
    val girdi = Scanner(System.`in`)
    println("Boyunuzu cm cinsinden giriniz")

    val boy = girdi.nextInt()
    println("Boyunuz : $boy")

    println("Kilonuzu giriniz")

    val kilo = girdi.nextInt()
    println("Kilonuz : $kilo")

    val boym = boy / 100

    val vucutki = kilo / (boym*boym)

    println ("Vücut kitle indeksi: $vucutki")

    if (vucutki<20)
        println("Ortalamaya göre zayıfsınız :(")
    else if (vucutki<=25)
        println("Ortalama kilodasınız")
    else if(vucutki<=30)
        println("Ortamaya göre fazla kilolusunuz")
    else
        println("Obezsiniz")
    




}