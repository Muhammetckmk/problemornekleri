package OOP;

public abstract class Hayvanlar {
   /*
    Problem:
    Bir hayvanat bahçesi için bir Hayvan sınıfı oluşturman gerekiyor. Bu sınıfın her hayvan için bir adı
    ve yaşı olacak. Ayrıca, her hayvanın "ses çıkar" adında bir fonksiyonu olacak. Farklı hayvanlar farklı sesler çıkaracak.

            Sonra, bu Hayvan sınıfından miras alan Köpek ve Kedi sınıflarını oluştur.

    Her iki sınıfın da ses çıkarma fonksiyonları şu şekilde çalışmalı:

    Köpek sınıfı için "Hav hav!"
    Kedi sınıfı için "Miyav!"
    İpucu:
    Sınıfın temel özellikleri (ad ve yaş) Hayvan sınıfında olacak.
    Farklı hayvanlar için ses çıkarma fonksiyonunu alt sınıflarda (Köpek ve Kedi) ez.
    Beklenen Çıktı:
    Bir köpek ve bir kedi nesnesi oluşturduğunda, adını ve yaşını yazdırabilecek, ayrıca "ses çıkar" fonksiyonunu çağırdığında her biri kendine özgü ses çıkaracak.
*/

    String nameAnimal;
    int ageAnimal;

    public Hayvanlar(String nameAnimal, int ageAnimal){
        this.ageAnimal=ageAnimal;
        this.nameAnimal=nameAnimal;

    }

    public abstract String sesi();

}

