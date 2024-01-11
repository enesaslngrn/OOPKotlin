package com.enesas.oopkotlin

class OzelSanatci(isim: String, yas: Int, meslek: String) : Sanatci(isim, yas, meslek) { // Sanatci sınıfından miras alıyoruz. Bir sınıftan miras alabilmek için başında open yazması gerek.

    // Bu sınıfı Inheritance'ı öğrenmek için açtık.

    fun sarkiSoyle(){

        println("şarkı söyleniyor")
    }
}