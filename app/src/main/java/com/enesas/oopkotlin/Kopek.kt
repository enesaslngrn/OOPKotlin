package com.enesas.oopkotlin

class Kopek: Hayvan() { // Dinamik polymorphism için

    fun kopekFonksiyonu(){

        super.sesCikar() // kalıtım yaptığı sınıfa yani Hayvan()' a referans veriyoruz. mesela "this" içinde bulunduğu yapı için kullanılırken.super ise üsttekine gider.
    }

    override fun sesCikar(){ // hem Hayvan() hem Kopek() içinde iki tane sesCikar() oldu. Bu sıkıntı oluyor. Bunu override ile yazmak gerek.
        println("Kopek() sınıfı")
    }
}