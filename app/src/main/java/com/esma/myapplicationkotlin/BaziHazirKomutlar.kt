package com.esma.myapplicationkotlin

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

fun main(){

    /*for (i in 0..10) {
        val rastgeleSayi = Random.nextInt(0,10)
        println("$rastgeleSayi")
    }*/

    val c = ceil(6.5)
    println("c: $c") // ceil büyüterek yuvarlar

    val f = floor(6.5)
    println("f: $f") // floor küçülterek yuvarlar

    val s = sqrt(4.0)
    println("s: $s") // sqrt karekök alır

    val a = abs(-10)
    println("a: $a") // abs mutlak değer alır

    val mx = max(100,200)
    val mn = min(100,200)
    println("max:$mx , min:$mn")

    val p = 2.0.pow(3.0) // 2 üzeri 3 demek. pow üzeri anlamı katar. (üslü işlem)
    println("p: $p")
}