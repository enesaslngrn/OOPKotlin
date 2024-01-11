package com.enesas.oopkotlin

class Islemler { // Bu sınıf Statik Polymorphism için.

    fun carpma(): Int{

        return 0
    }

    fun carpma(a: Int, b: Int): Int{

        return a*b
    }

    fun carpma(a: Int, b: Int, c: Int): Int{

        return a*b*c
    }

    // yani 3 ayrı carpma() fonksiyonu olması önemli değil. İçerikleri farklı.
}