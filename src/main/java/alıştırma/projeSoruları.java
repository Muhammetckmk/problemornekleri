package alıştırma;

public class projeSoruları {
   public static void main(String[] args) {
        /*Proje: Restoran Sipariş Sistemi
        Özellikler:
        Menü Oluşturma: Kullanıcıya menüyü göstermek için bir sınıf oluşturun. Menüde yemeklerin adı,
        açıklaması ve fiyatı yer alsın.
        Sipariş Ekleme: Kullanıcı menüden seçtiği yemekleri siparişine ekleyebilsin.
        Her seçimin ardından toplam tutarı güncelleyin.
        Sipariş Tamamlama: Sipariş verildikten sonra, sipariş özeti ve toplam tutarı gösterin.
        Fiyat Hesaplama: Eklenen yemeklerin fiyatlarını toplayarak toplam tutarı hesaplayın.

        Sınıflar:
        Yemek: Yemeğin adı, açıklaması, fiyatı.
        Menu: Menüde yer alan yemeklerin listesi ve gösterimi.
        Sipariş: Kullanıcının seçtiği yemeklerin listesi ve fiyatların toplanması.
        Bu proje, basit bir menü gösterimi, döngüler ve kullanıcıdan girdi alarak liste oluşturma gibi
        temel programlama kavramlarını pekiştirmeye yardımcı olabilir.



        Proje: Ev Tipi Doğalgaz Faturası Hesaplama

        Ev Tipleri: Apartman dairesi, müstakil ev, villa

        Apartman dairesi: 1+1, 2+1, 3+1
        Müstakil ev: Tek katlı, dubleks
        Villa: Küçük, orta, büyük
        Fatura dönemi: Kış 2024, Yaz 2024

        dönem: Kış 2024 (Kasım, Aralık, Ocak)
        dönem: Yaz 2024 (Haziran, Temmuz, Ağustos)
        Fiyatlar:

        Apartman dairesi (1+1: 400 TL, 2+1: 500 TL, 3+1: 600 TL)
        Müstakil ev (Tek katlı: 800 TL, Dubleks: 1000 TL)
        Villa (Küçük: 1200 TL, Orta: 1500 TL, Büyük: 1800 TL)
        İşlemler:

        Kullanıcıya bir menü (form) sunalım ve fatura dönemi ile ev tipi bilgilerini alalım.
        Hatalı giriş yapılırsa "Hesaplama Başarısız" uyarısı verelim ve menü tekrar gösterilsin.
        Menüyü tekrar göstermeden önce yeni işlem veya çıkış seçeneklerini sunalım.
        Kullanıcının seçtiği fatura dönemi ve ev tipine göre doğalgaz faturası hesaplayalım.

                *

                Proje: Elektrik Tüketim Ücreti Hesaplama
        Ev Tipleri: Daire, Dubleks, Müstakil Ev, Villa

        Daire: 70-100 m², 101-130 m², 131-160 m²
        Dubleks: 160-200 m², 201-250 m²
        Müstakil Ev: 250-300 m², 301-350 m²
        Villa: 350+ m²
        Fatura dönemi: Ocak 2024, Temmuz 2024

        dönem: Ocak 2024 (Kış dönemi)
        dönem: Temmuz 2024 (Yaz dönemi)
        Fiyatlar:

        Daire (70-100 m²: 250 TL, 101-130 m²: 300 TL, 131-160 m²: 350 TL)
        Dubleks (160-200 m²: 500 TL, 201-250 m²: 600 TL)
        Müstakil Ev (250-300 m²: 700 TL, 301-350 m²: 850 TL)
        Villa (350+ m²: 1000 TL)
        İşlemler:

        Kullanıcıya bir menü (form) sunalım ve fatura dönemi ile ev tipi ve metrekare bilgilerini alalım.
        Yanlış bilgi girilirse "Hesaplama Başarısız" uyarısı verelim ve menü tekrar gösterilsin.
        Menüde yeni işlem veya çıkış için seçenek sunalım.
        Fatura dönemi ve ev tipine göre elektrik tüketim ücreti hesaplayalım.

        *

        Proje: İnternet Abonelik Ücreti Hesaplama
        Abonelik Paketleri: Standart, Aile, Sınırsız

        Standart: 16 Mbps, 24 Mbps
        Aile: 35 Mbps, 50 Mbps
        Sınırsız: 100 Mbps
        Fatura dönemi: Mart 2024, Eylül 2024

        dönem: Mart 2024 (Bahar dönemi)
        dönem: Eylül 2024 (Sonbahar dönemi)
        Fiyatlar:

        Standart (16 Mbps: 100 TL, 24 Mbps: 150 TL)
        Aile (35 Mbps: 200 TL, 50 Mbps: 250 TL)
        Sınırsız (100 Mbps: 300 TL)
        İşlemler:

        Kullanıcıya bir menü (form) sunalım ve fatura dönemi ile internet paketi bilgilerini alalım.
        Hatalı giriş yapılırsa "Hesaplama Başarısız" mesajı verip menüyü tekrar gösterelim.
        Menüde yeni işlem yapmak veya çıkış için seçenek sunalım.
        Kullanıcının seçtiği paket ve fatura dönemine göre internet abonelik ücretini hesaplayalım.


        *
        1. Kütüphane Yönetim SistemiProje Özeti:Bu projede, kullanıcılar kütüphaneye
        kitap ekleyebilir, eklenen kitaplar arasında arama yapabilir ve kütüphanedeki
        tüm kitapları listeleyebilir. Bu proje, veri saklama, arama algoritmaları ve
        koleksiyonlar gibi konuları öğrenmek için iyi bir fırsat sunar.

        Proje Detayları:

        Kitap: Kitaplar için bir sınıf tanımlanır ve her kitabın adı,
        yazarı ve basım yılı gibi özellikleri bulunur. Kitap sınıfı, kitapların bilgilerini
        tutar ve yazdırılabilir formatta (toString()) ekrana basılmasını sağlar.
        Kütüphane: Kütüphane sınıfı kitapları bir liste içinde tutar. Kullanıcıya kütüphaneye kitap ekleme,
        kitap arama ve kitapları listeleme gibi işlevler sunar. Kitap arama, kullanıcının girdiği kitap ismine göre yapılır.
        İşlevler:Kitap Ekleme: Kullanıcı, kitap ismi, yazar ve basım yılını girerek kütüphaneye yeni bir kitap ekler.
        Kitap Arama: Kullanıcı, kitap ismini girerek kütüphanede bulunan kitaplar arasında arama yapabilir.
        Kitapları Listeleme: Kullanıcı kütüphanede bulunan tüm kitapları görebilir.

        *
        ATM İşlem SimülasyonuProje Özeti:Bu projede kullanıcıya basit bir ATM sistemine giriş yaparak hesap işlemleri
        yapma imkanı verilir. Kullanıcı para çekebilir, para yatırabilir ve mevcut bakiyesini görüntüleyebilir.
        Kullanıcının yanlış işlem yapması durumunda sistem uygun hataları verir.

        Proje Detayları:

        BankaHesabi: Kullanıcının hesap bakiyesini tutan ve para yatırma, çekme gibi işlemleri yapan sınıf.
        Başlangıç bakiyesi sisteme tanımlanır ve bu bakiye üzerinde işlemler gerçekleştirilir.
        Para Çekme ve Yatırma: Kullanıcıdan çekilecek veya yatırılacak miktar istenir ve bakiye güncellenir.
        Para çekme işlemi sırasında bakiyenin yeterli olup olmadığı kontrol edilir.
        Bakiye Görüntüleme: Kullanıcının mevcut bakiyesi ekranda gösterilir.
        İşlevler:
        Para Yatırma: Kullanıcı hesabına istediği miktarı yatırabilir.
        Para Çekme: Kullanıcı hesabından para çekebilir. Çekilen miktarın, mevcut bakiyeden fazla olmaması gerekir.
        Bakiye Görüntüleme: Kullanıcı mevcut bakiyesini görebilir.Çıkış: Kullanıcı ATM sisteminden çıkış yapabilir.

        *
        Not Ortalaması Hesaplama SistemiProje Özeti:Bu projede, öğrenci derslerine ait notları girer ve bu notlara
        göre sistem not ortalamasını hesaplar. Kullanıcı dilediği kadar ders ekleyebilir ve tüm dersler listelenerek
        ortalamaları hesaplanır. Bu proje, kullanıcıdan veri alma ve liste işlemlerini öğrenmek için faydalıdır.

        Proje Detayları:
        Ders: Her ders için ismi ve notu tutan bir sınıf. Dersler bu sınıf içinde saklanır ve eklenir.
        Ogrenci: Öğrencinin aldığı dersleri ve notlarını tutan sınıf. Aynı zamanda bu sınıf, not ortalamasını
        hesaplar ve tüm dersleri listeler.
        Not Ortalaması Hesaplama: Girilen notlar toplanır ve ders sayısına bölünerek ortalama hesaplanır.
        İşlevler:Ders Ekleme: Kullanıcı, ders ismi ve ders notunu girerek yeni bir ders ekler.
        Not Ortalaması Görüntüleme: Kullanıcının girdiği ders notlarının ortalaması hesaplanır ve ekrana basılır.
        Dersleri Listeleme: Kullanıcı, eklediği tüm dersleri ve notları görebilir.
         *

         /*
        Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk

       Tarife dönemi:Aralık 2024,Haziran 2024
          1.dönem :Haziran 2024               2.dönem:Aralık 2024
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750

        1-Tekrar tekrar kullanılan bir seçim menüsü(form) gösterelim.
        2-Tarife dönemi bilgisi,araç tipi bilgilerini kullanıcıdan alalım.
        3-Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü(form) gösterilsin.
        4-Menüde yeni işlem veya çıkış için seçenek sunulsun .
        5-tarife dönemi ve araç tipine göre sigorta primi hesaplansın.
         */


    }

    }

