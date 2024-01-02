package com.esma.myapplicationkotlin


fun main(){

    var ogrenciAdi = "esma"
    var ogrenciYasi = 19
    var ogrenciBoyu = 1.39
    var ogrenciBasHarf = 'e'

    println(ogrenciAdi)
    println(ogrenciYasi)
    println(ogrenciBoyu)
    println(ogrenciBasHarf)

    var urun_id:Int = 3416
    var urun_adi:String = "Kol saati"
    var urun_adet:Int = 100
    var urun_fiyat:Double = 109.99
    var urun_tedarikci:String = "rolex"

    println("urun_id : $urun_id")
    println("urun_adi : $urun_adi")
    println("urun_adet :$urun_adet")
    println("urun_fiyat : $urun_fiyat")
    println("urun_tedarikci :$urun_tedarikci")

    println("$urun_tedarikci marka $urun_adi $urun_fiyat fiyatla satılmaktadır. Stokta $urun_adet adet kalmıştır.")

    var a = 10
    var b = 20
    println("$a + $b nin toplamı = ${a+b}")



}
