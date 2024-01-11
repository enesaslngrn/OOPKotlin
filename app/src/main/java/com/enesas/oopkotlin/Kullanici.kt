package com.enesas.oopkotlin

class Kullanici: Insan { //Bu da abstract class anlatmak için. Dikkat et Insan() değil sadece Insan çünkü abstract classlarda obje yok. içine bişey yazamayız.

    var isim: String? = null
    var yas: Int? = null

    constructor(isim: String, yas: Int){ // artık Kullanici() sınıfı cağırılınca mecbur isim ve yas girilmek zorunda.
        this.isim = isim // buradaki ismi yukardakine eşitledik
        this.yas = yas // yaşı da eşitledik

        println("constructor çağırıldı")
    }

    init { // her obje oluşturduğumuzda ilk çağırılan kod bloğu budur. Initiliazation.
        println("init çağırıldı")
    }
}