package com.esma.myapplicationkotlin

fun main()  {

    for (i in 3..5) { // 3,4,5
        println(i)
    }

    //örnek: 10 dan 20 ye 5 er 5 er

    var baslangic = 10
    var bitis = 20
    var artis = 5

    for (a in baslangic..bitis step artis ) {
        println("a: $a")
    }
    // -step artışı ifade eder-

    //örnek: 20 den 10 a 2 şer

    for (b in 20 downTo 10 step 2) {
        println(" b: $b ")
    }
   // -downTo aşağıdan yukarıya yani bize göre ters yönlü saymayı ifade eder.-

    for (c in 1 until 5 ) {
        println("c: $c")
    }
    // -until son sayıyı dahil etme anlamında kullanılır.-

    //WHİLE

    var sayac = 1
    while (sayac<4) {
        println("sayac: $sayac")
        sayac +=1 // sayac = sayac + 1
    }


}