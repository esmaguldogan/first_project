package com.esma.myapplicationkotlin

import java.util.Scanner

fun main () {

 val girdi = Scanner(System.`in`)
 print("Not hesaplama(1)")

 val secim = girdi.next()
 println("Seçiminiz : $secim")

 println("Sınav 1 i girin")
 val sinav1 = girdi.nextInt()

 println("Sinav2 yi giriniz")
 val sinav2 = girdi.nextInt()

 println("Sınav 3 ü giriniz")
 val sinav3 = girdi.nextInt()

 println("Sınav ortalaması")
 val sinavortalamasi = (sinav1+sinav2+sinav3) / 3

 println("Sınav ortalaması: $sinavortalamasi")

 if (sinavortalamasi < 50)
  println("Kaldı")

  else if (sinavortalamasi <= 70)
  println("İyi")

  else if (sinavortalamasi <= 100) print("Geçti")
}




