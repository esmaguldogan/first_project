package com.esma.myapplicationkotlin

fun main() {
    //1. şekilde

    var sayilartoplami = 0

    for (i in 1..100) {
        println("Sayılar Toplamı: $sayilartoplami")
        sayilartoplami = sayilartoplami + i

        if (sayilartoplami==99)
            println("Sona ulaştınız")
    }
    //2.şekilde

    for(i in 1..100){
        println(i)

        if (i==99)
        println("Sona ulaştınız")
    }
}



