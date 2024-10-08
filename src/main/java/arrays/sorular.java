package arrays;

public class sorular {
    public static void main(String[] args) {
      /*  1. Bir Dizideki Elemanların Toplamını Bulma

        2. Bir Dizideki En Büyük Elemanı Bulma

        3. Diziyi Ters Çevirme

        4. Bir Dizide Belirli Bir Elemanın Bulunup Bulunmadığını Kontrol Etme

        5. Dizideki Elemanları Küçükten Büyüğe Sıralama (Bubble Sort)

        6. Bir dizideki her elemanın kaç kez tekrarlandığını bulan bir program yazın.

             7   Verilen iki diziyi birleştirip üçüncü bir diziye ekleyen ve bu dizideki elemanları sıralayan bir program yazın.

               8 Bir dizideki en küçük ikinci elemanı bulan bir program yazın.

                int[] numbers = {10, 5, 3, 9, 6, 8};

        9 Verilen bir dizideki çift ve tek sayıları iki ayrı diziye ayıran bir program yazın.
        int[] numbers = {1, 2, 3, 4, 5, 6};

       10. Bir dizide tekrarlanan elemanları bulan bir program yazın.
        int[] numbers = {1, 2, 3, 2, 4, 5, 3, 6};


        problemler



       * 1. Sınıftaki En Çalışkan Öğrenciyi Bulma
        Bir öğretmen, öğrencilerinin son 5 sınavdaki notlarını bir dizide tutuyor. Öğrencilerin adları ve notları şu şekildedir:

        Ahmet: 70, 85, 90, 75, 80
        Ayşe: 60, 70, 65, 85, 90
        Mehmet: 95, 90, 85, 80, 95
        Elif: 50, 60, 55, 65, 70
        Her öğrencinin sınav ortalamasını hesaplayıp en yüksek ortalamaya sahip olan öğrenciyi bulmanız gerekiyor.

                Problem: En çalışkan öğrenciyi ve ortalama puanını bulacak bir program yazın.

       * 2. Restoranda En Popüler Yiyeceği Bulma
        Bir restoranın menüsünde birkaç yemek var ve her yemek her gün kaç kez sipariş edildiği ile takip ediliyor.
         7 günlük süre boyunca, şu yemeklerin sipariş sayıları şu şekildedir:


        Pizza: 15, 20, 18, 25, 30, 22, 19
        Hamburger: 10, 12, 15, 14, 13, 12, 11
        Salata: 5, 6, 4, 7, 8, 9, 6
        Tatlı: 7, 9, 8, 6, 5, 8, 7
        Her yemeğin haftalık toplam sipariş sayısını bulmanız ve en çok sipariş edilen yemeği bulmanız gerekiyor.

                Problem: Hangi yemek en popüler ve toplam kaç kez sipariş edilmiş?

        *3. Envanter Yönetimi
        Bir mağaza, haftalık ürün stoklarını kontrol etmek için bir dizi kullanıyor. Aşağıdaki ürünlerin
        stokları hafta boyunca şu şekilde değişmiştir:


        Televizyon: 30, 28, 25, 23, 20, 18, 15
        Buzdolabı: 10, 9, 8, 7, 6, 5, 4
        Bilgisayar: 20, 18, 17, 16, 14, 13, 12
        Çamaşır Makinesi: 5, 4, 3, 2, 1, 0, 0
        Her ürünün ne zaman stoklarının sıfırlandığını bulmanız gerekiyor.

        Problem: Hangi ürünün stoku ilk önce sıfıra düşüyor? Hangi gün sıfıra düşüyor?

              *  4. Maç İstatistikleri
        Bir futbol takımı 10 hafta boyunca maç yapmıştır ve her maçın gol sayılarını bir dizide tutmuştur.
        İşte maç başına attıkları gol sayıları:

        1. Hafta: 2 gol
        2. Hafta: 1 gol
        3. Hafta: 3 gol
        4. Hafta: 2 gol
        5. Hafta: 0 gol
        6. Hafta: 4 gol
        7. Hafta: 1 gol
        8. Hafta: 2 gol
        9. Hafta: 3 gol
        10. Hafta: 1 gol
        Bu takımı analiz ederek, kaç hafta boyunca 2 veya daha fazla gol attıklarını bulmanız gerekiyor.

                Problem: Takım kaç hafta 2 veya daha fazla gol atmıştır?

            *    5. Film İzleyici İstatistikleri
        Bir sinema salonu, her hafta gösterimde olan filmlerin izlenme sayılarını tutmaktadır.
    5 hafta boyunca her film şu kadar kişi tarafından izlenmiştir:

        Film 1: 120, 100, 130, 140, 150
        Film 2: 80, 90, 85, 100, 110
        Film 3: 200, 180, 170, 190, 210
        Film 4: 50, 60, 55, 65, 70
        Sinema salonu, en çok izleyici çeken filmi bulmak ve toplam izleyici sayısını hesaplamak istemektedir.

                Problem: Hangi film en çok izleyici çekmiştir ve toplamda kaç kişi bu filmi izlemiştir?

                Bu tarz hikayeli sorularla, programlama becerilerini gerçek dünya senaryolarına uygulayarak daha eğlenceli hale getirebilirsin!


        1. Macera Adasında Hazine Arayışı
        Bir grup korsan, harita üzerindeki hazinenin bulunduğu bir adaya geldi. Haritada 7 farklı noktada gömülü hazine olduğu işaretlenmiş,
        ancak bazı noktalar hazineyi bulmaya çalışırken kayboldu. Elinizde korsanların keşfettiği her bir noktanın koordinatlarının olduğu
        bir dizi var. Ancak hazineyi sadece her iki noktada bulunan işaretlerin toplamı en büyük olan yerlerde bulabilirsiniz.

        Görev: En büyük toplam işarete sahip iki hazine noktasını bulun.

        2. Uzay Gemisi Kargo Dağılımı
        Bir uzay gemisi, Mars'a gitmek üzere Dünya'dan ayrılıyor ve üzerinde farklı ağırlıklarda birçok kargo bulunuyor.
        Gemideki mühendisler, geminin dengede kalması için ağır kargoları bir tarafa, hafif kargoları ise diğer tarafa yerleştirmek zorunda.
        Elinizde bir kargo dizisi var. Ağırlıkları çift olanları bir yana, tek olanları başka bir yana yerleştirmeniz gerekiyor.

        Görev: Kargoları çift ve tek olarak iki farklı listeye ayırın.



        3. Büyücü Kulesindeki İksirler
Bir büyücü, çeşitli güçlere sahip iksirleri laboratuvarında saklıyor. Elinizdeki dizide, her bir iksirin gücü farklı bir sayı ile temsil ediliyor. Ancak bazı iksirler birbirine çok yakın olduğu için karışıklık yaşanıyor. Büyücü sizden laboratuvardaki en güçlü ve en zayıf ikinci iksiri bulmanızı istiyor.

Görev: En güçlü ve en zayıf ikinci iksiri bulun.

        4. Gizemli Şehirdeki Kod Şifreleri
Gizemli bir şehirde, her bina bir şifre ile korunmaktadır. Her bina şifresi, rastgele sayıların bir kombinasyonundan oluşur. Şehrin merkezi bilgisayarı ise bu şifrelerin ne sıklıkta tekrarlandığını bulmak zorunda. Elinizdeki dizide bu bina şifreleri var ve her bir şifrenin kaç kez tekrarlandığını bulmalısınız.

Görev: Her bir şifrenin tekrar sayısını bulun.

     5. Tarihi Kalede Kralın Zırh Parçaları
Bir kral, tarihi bir kalede savaşa hazırlanırken zırhının parçalarını kaybetmiş. Elinizde zırh parçalarının bulunduğu bir dizi var, ancak bazı parçalar aynı. Kral sizden, zırhın sadece bir kez olan parçalarını bulmanızı ve fazlalıkları çıkarmanızı istiyor.

Görev: Fazlalık olan zırh parçalarını çıkarıp, sadece bir kez olan parçaları bulun.


       */


    }
}
