package com.esma.myapplicationkotlin

import kotlinx.coroutines.processNextEventInCurrentThread

fun main (){

    //3 ile 6

    for(i in 3..6){
        println("Dongu1: $i")
    }

    var sayac = 3

    while (sayac<7) {
        println("Dongu2: $sayac")
        sayac+=1
    }

    // 0 dan 8 e 2 şer

    for(i in 0..8 step 2) {
        println("Dongu3: $i ")
    }

    var sayac1=0
    while(sayac1<9) {
        println("Dongu4: $sayac1")
        sayac1+=2
    }

    // 8 den 0 a 2 şer

    for(i in 8 downTo 0 step 2) {
        println("Dongu5: $i")
    }

    var sayac2 = 8
    while (sayac2> -1){
        println("Dongu6: $sayac2")
        sayac2-=2
    }
}