package com.enesas.oopkotlin

open class Hayvan { // Dinamik polymorphism için

    open fun sesCikar(){ // Kopek() sınıfından bunu kalıtım alıp override etmek için bununda open olması gerek.
        println("Hayvan() sınıfı")

    }
}