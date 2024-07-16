package com.esma.nesnetabanliprogramlama

  class Araba(var renk:String, var hiz:Int, var calisiyormu:Boolean){

      fun calistir(){
          calisiyormu= true
      }

      fun durdur(){
          calisiyormu= false
          hiz=0
      }
      fun hizlan(kacKm:Int){
          hiz= hiz+kacKm
      }
      fun yavasla(kacKm:Int){
          hiz= hiz-kacKm
      }
      fun bilgiAl (){
          println("Renk: $renk")
          println("Hız: $hiz")
          println("Çalışıyormu: $calisiyormu")
      }

}


