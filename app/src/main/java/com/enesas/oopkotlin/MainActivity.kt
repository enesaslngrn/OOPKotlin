package com.enesas.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enesas.oopkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        println("-------Encapsulation--------")
        val ahmet = Sanatci("Ahmet",50,"Müzisyen")

        println(ahmet.isim) // Ahmet.isim get ile alabildik.
        // ahmet.isim = "Ahmet2" ama ismi değiştiremiyoruz. Setter is private diyor.

        println("-------Inheritance--------")

        val enes = OzelSanatci("Enes",26,"Tiyatrocu") // şu an enes OzelSanatci'dan ulaşılıyor ama o da Sanatci'dan miras alıyor.

        enes.sarkiSoyle() // diyebiliriz.
        // ahmet.sarkiSoyle() diyemeyiz çünkü bu OzelSanatci classında olan bi fonksiyon.

        println("-------Polymorphism--------")

        // Statik Polymorphism
        val islem = Islemler()

        println(islem.carpma())
        println(islem.carpma(2,3))
        println(islem.carpma(2,3,4))


        // Dinamik Polymorphism
        val kedi = Hayvan()
        kedi.sesCikar()

        val kopek = Kopek()
        kopek.sesCikar()
        kopek.kopekFonksiyonu() // mesela bu Hayvan() sınıfı yazdıracak çünkü fonksiyona super girdik.

        println("-------Abstraction & Interface--------")
        // Soyut sınıflar kendisinden obje oluşturulamayan sınıflardır.

        val kullanici = Kullanici("Enes",26)
        kullanici.insanFonksiyonu() // Abstract class'ımız Insan() Kullanici()'dan miras aldı.


        var gitar = Gitar()
        gitar.marka = "Gitar Markası"
        gitar.elektro = true

        gitar.bilgi()
        println(gitar.oda)

        println("-------Lambda Expressions--------")
        yazdigimiYazdir("TEST")


        val yazdigimiYazdirLambda = {verilenString: String -> println(verilenString)}
        yazdigimiYazdirLambda("TEST LAMBDA")

        val carpmaIslemiLambda = {a: Int, b: Int -> a*b}
        println(carpmaIslemiLambda(2,3))

        val carpmaIslemiLambdaV2: (Int,Int) -> Int = {a,b -> a*b} // yani 2 tane int değeri alıp int döndüreceğim dedik. Böylede yazılır.
        println(carpmaIslemiLambdaV2(2,3))
    }

    fun yazdigimiYazdir(string: String){ // lambda ile bu fonksiyonun aynısını yukarıda tek satırda yazıcaz.
        println(string)
    }
}