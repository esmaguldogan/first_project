package com.esma.nesnetabanliprogramlama

class FahrenheitOdev {
    //Parametre	olarak	girilen	dereceyi	fahrenhiet’a dönüştürdükten
    //sonra	geri	döndüren	bir	metod yazınız.	T(°F) = T(°C) × 1.8	+	32

    fun donustur(derece:Double):Double{
        val fahrenheit = derece*1.8 +32
        return fahrenheit
    }
}