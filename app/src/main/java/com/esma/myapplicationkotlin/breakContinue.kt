package com.esma.myapplicationkotlin

fun main(){

    for(i in 1..5) {
        if (i == 3) {
            break
        }
        println("Döngü 1 : $i")
    }

    for (i in 1..5) {
        if (i == 3) {
            continue
        }
        println("Döngü 2 : $i")
    }
}

// bu dersten anladığımız şey "break" döngüyü durdurur. "continue" ise o olasılığı geçer.
