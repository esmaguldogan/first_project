package com.esma.nesnetabanliprogramlama

fun main (){
    val m = Matematik()

    m.topla(100,200)

    val c= m.cikar(300.0,100.0)
    println(c)

    m.carp(20,5,"Esmagül")

    val veri = m.bol(100.0,2.0)
    println(veri) 
}