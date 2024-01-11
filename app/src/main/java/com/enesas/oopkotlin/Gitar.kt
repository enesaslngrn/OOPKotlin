package com.enesas.oopkotlin

class Gitar: Enstruman, Dekorasyon { // Bu class interface için. Class'lar sadece 1 tane inheritance alabilir. Ama Interface'ler 1 den fazla.

    var marka: String? = null
    var elektro: Boolean? = null


    override var oda: String
        get() = "Salon" // yani diyor ki oda değişkeni çağırılınca hangi değeri vereyim?
        set(value) {}
}