package com.esma.myapplicationkotlin


fun main(){

    var yas = 17
    var isim = "Mehmet"

    //Örnek

    if (yas >= 18)
        println("Reşitsiniz")

    //Burada anladığım şey if yapısındaki koşul sağlanırsa println yazdırılır.
    //Örnek 2

    if (yas >= 18)
        println("Reşitsiniz")
    else
        println("Reşit değilsiniz")

    // else ise if koşulu sağlanmadığı durumdaki cevabı gösterir. Böylece her iki durumda da bir sonuç yazdırılmıs olur.

    //Örnek 3

    if (isim == "ahmet")
        println("Merhaba ahmet")
    else
        println("Tanınmayan kişi")

    // Örnek 5

    var kullaniciAdi = "Admin"
    var şifre = 12345

    if (şifre == 12345 && kullaniciAdi == "Admin")
        println ("Hoş geldiniz")
    else
        println("Hatalı giriş")

    //Örnek 6

    var sınıf = 8
    if (sınıf == 9 || sınıf == 10 || sınıf == 11 || sınıf == 12)
        println("Ayt sınavına hazırlanabilirsiniz")
    else
        println("Lgs sınavına hazırlanmalısınız")

    // Örnek 7

    var a = 10
    var b = 10
    if (a==b) println("Eşit")
else
println("Eşit değil")
}