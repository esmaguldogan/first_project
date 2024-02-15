package com.esma.myapplicationkotlin

fun main (){

    val dizi1 = Array<Int>(5){0}// [0,0,0,0,0]

    val dizi2 = arrayOf (1,0,7)

    val dizi3 = arrayOf<Int>(1,36,9)

    val dizi4 = arrayOf<String>("Çilek","Ahmet")

    val dizi5 = arrayOf(3,8,"Elma","Bursa")

    val meyveler = arrayOf<String> ("Çilek","Muz","Elma","Kivi","Kiraz")

    //Verilere Erişim

    val str1 = meyveler[2]

    println(str1)

    val str2 = meyveler.get(3)

    println(str2)

    //Veri üzerinde işlem yapma

    meyveler[1] = "Yeni Muz"

    println(meyveler.contentToString())

    meyveler.set(2,"Yeni Elma")

    println(meyveler.contentToString())

    //Array işlemleri

    println(meyveler.isEmpty()) // dizi dolu mu boşmu? doluya false

    println(meyveler.count()) // kaç eleman?

    println(meyveler.first()) // ilk eleman ?

    println(meyveler.last()) // son eleman ?

    println(meyveler.indexOf("Kivi")) // kivi kaçıncı indekste ?

    println(meyveler.contains("Muz")) // Dizi içerisinde muz var mı yok mu ?

    println(meyveler.max())

    println(meyveler.min())

    println(meyveler.sort())

    println(meyveler.contentToString())

    println(meyveler.reverse())

    println(meyveler.contentToString())




}