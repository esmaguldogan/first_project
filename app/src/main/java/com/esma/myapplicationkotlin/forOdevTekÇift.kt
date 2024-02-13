package com.esma.myapplicationkotlin

fun main() {

    var teksayilartoplami = 0

    var ciftsayilartoplami = 0

    for (i in 1..99 step 2) {
        teksayilartoplami = teksayilartoplami + i
    }
    for (a in 2..99 step 2){
        ciftsayilartoplami = ciftsayilartoplami + a
    }

    println("T.Sayılar Toplamı: $teksayilartoplami")
    println("Ç.Sayılar Toplamı: $ciftsayilartoplami")

       if (teksayilartoplami>ciftsayilartoplami) {
           println("Tek Sayılar Büyük")
       }
       else if (teksayilartoplami<ciftsayilartoplami) {
           val tcfark = ciftsayilartoplami - teksayilartoplami
           println("Tc fark: $tcfark")
       }

    //biraz uğraştırdı ama yapınca çok mutlu etti :)


}
