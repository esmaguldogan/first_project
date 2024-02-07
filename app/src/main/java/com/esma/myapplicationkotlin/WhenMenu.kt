package com.esma.myapplicationkotlin

import java.util.Scanner

fun main() {

     val girdi = Scanner(System. `in`)

     println("Sil (1)")
     println("Ekle (2)")

     val tercih = girdi.nextInt()

     when (tercih){
          1 -> println("Veri Silindi")
          2 -> println("Veri Eklendi")
          else -> println("Böyle bir işlem yok")
     }
}