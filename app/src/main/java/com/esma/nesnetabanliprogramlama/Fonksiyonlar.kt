package com.esma.nesnetabanliprogramlama

fun main(){

    fun selamla(){
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }
    selamla()

    fun selamla1(): String{
        val sonuc= "Merhaba Mehmet"
        return sonuc
    }
    val gelenSonuc = selamla1()
    println(gelenSonuc)

    fun selamla2 (isim:String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }
    selamla2("Ahsen")

    fun toplama(){
        val toplam = 30 + 40
        println("Toplam = $toplam")

    }
    toplama()

    fun toplama1():Int{
        val toplam = 30 + 90
        return toplam
    }
    val t1 = toplama1()
    println("t1: $t1")

    fun toplama2 (sayi1:Int, sayi2:Int): Int {
        val toplam = sayi1 + sayi2
        return  toplam
    }
    val t2 = toplama2(100,200)
    println("t2: $t2")
}