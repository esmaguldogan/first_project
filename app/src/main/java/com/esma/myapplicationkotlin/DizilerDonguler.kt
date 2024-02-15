package com.esma.myapplicationkotlin

fun main () {

    val meyveler = arrayOf<String>("Çilek","Muz","Avokado","Böğürtlen","Kivi")
    for(meyve in meyveler){

        println("Sonuç:$meyve")
    }

    for ((indeks, meyve) in meyveler.withIndex()){
        println("Sonuç $indeks: $meyve")
    }
}
