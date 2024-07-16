package com.esma.nesnetabanliprogramlama

fun main(){
    val kamilKoc = Otobus(50,"bursa","ankara",10)

    /*println(kamilKoc.kapasite)
    println(kamilKoc.nereden)
    println(kamilKoc.nereye)
    println(kamilKoc.mevcutYolcu)*/

    kamilKoc.bilgiAl()

    kamilKoc.kapasite = 100
    kamilKoc.nereden = "İzmir"
    kamilKoc.nereye = "İstanbul"
    kamilKoc.mevcutYolcu = 30

    /*println(kamilKoc.kapasite)
    println(kamilKoc.nereden)
    println(kamilKoc.nereye)
    println(kamilKoc.mevcutYolcu)*/

    kamilKoc.bilgiAl()

    kamilKoc.yolcuAl(20)
    kamilKoc.bilgiAl()

    kamilKoc.yolcuIndir(40)
    kamilKoc.bilgiAl()

    val otobusFirmasi = Otobus(50,"Bursa","İzmir",5)
    otobusFirmasi.bilgiAl()
  //örneklerde biraz zorlandım

}