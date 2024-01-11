package com.enesas.oopkotlin

open class Sanatci(isim: String, yas: Int, meslek: String) {

    //Encapsulation (Hangi sınıfın hangi özelliğine nereden ulaşabiliriz bunu kontrol eder.
    var isim: String? = isim
        private set //ismi değiştiren işlemler private olsun ki her yerden değiştirilmesin. ÇOK İYİ ÖZELLİK LAN
        get // ismi alan işlemler private olmasın ki ulaşabilelim.

    var yas: Int? = yas
        private set
        get

    private var meslek: String? = meslek // Ya da direkt private yapıyoruz. Hem set hem get ulaşılamaz.

}