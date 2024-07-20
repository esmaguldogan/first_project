package com.esma.nesnetabanliprogramlama

fun main(){

    fun toplam(vararg sayilar: Int) : Int{
        var sonuc = 0
        for (s in sayilar){
            sonuc = sonuc + s
        }
        return sonuc
    }
    val t1= toplam (1,2,3,4,5,6,7,8,9)
    // deneme
    println("t1= $t1")

}