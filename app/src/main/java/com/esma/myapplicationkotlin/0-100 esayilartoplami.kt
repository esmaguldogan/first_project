package com.esma.myapplicationkotlin

fun main() {

    var sayilartoplami= 0

    for(i in 1..100) {
        println("Sayılar Toplamı: $sayilartoplami")
        sayilartoplami = sayilartoplami + i
    }
}
