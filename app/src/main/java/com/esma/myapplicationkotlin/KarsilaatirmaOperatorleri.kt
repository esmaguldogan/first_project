package com.esma.myapplicationkotlin

class KarsilaatirmaOperatorleri

fun main() {
    var s1 = 40
    var s2 = 50

    var y1 = 70
    var y2 = 91

    println (s1 == s2) // "==" eşittir demektir
    println (s1 != s2) // "!=" eşit değildir demektir"
    println (s1 <= s2)
    println (s1 >= s2)
    println (s1 < s2)
    println(s1<s2 || y1>y2) // "||" birinin doğru olması kıyasmanın true olması için yeterlidir.
    println(s1<s2 && y1>y2) // "&&" İkisininde doğru olması gerekir true olmak için.
}