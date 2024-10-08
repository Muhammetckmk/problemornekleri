package arrays;

public class hangiyemekDahaPopüler {
    public static void main(String[] args) {
        //  Pizza: 15, 20, 18, 25, 30, 22, 19
        //  Hamburger: 10, 12, 15, 14, 13, 12, 11
        //  Salata: 5, 6, 4, 7, 8, 9, 6
        //  Tatlı: 7, 9, 8, 6, 5, 8, 7
        //  Her yemeğin haftalık toplam sipariş sayısını bulmanız ve en çok sipariş edilen yemeği bulmanız gerekiyor.

        //          Problem: Hangi yemek en popüler ve toplam kaç kez sipariş edilmiş?

        int[] pizza=    {15, 20, 18, 25, 30, 22, 19};
        int[] hamburger={10, 12, 15, 14, 13, 12, 11};
        int[] salata=   {5, 6, 4, 7, 8, 9, 6};
        int[] tatlı=    {7, 9, 8, 6, 5, 8, 7};

        int[][] ürünler= {{10, 12, 15, 14, 13, 12, 11},
                {5, 6, 4, 7, 8, 9, 6},
                {7, 9, 8, 6, 5, 8, 7},
                {15, 20, 18, 25, 30, 22, 19}};
        String[] yemek={"hamburger","salata","tatlı","pizza"};

        String enPopulerürün="";
        int totalSparis=0;

        for (int i=0; i<ürünler.length; i++){
            int toplamSipariş=0;

            for (int j = 0; j <ürünler[i].length ; j++) {
                toplamSipariş+=ürünler[i][j];


            }
            System.out.println(toplamSipariş);

            if (toplamSipariş>totalSparis){
                totalSparis=toplamSipariş;
                enPopulerürün=yemek[i];
            }
        }
        System.out.println("en çok tercih edilen ürün = "+ enPopulerürün +" => " +totalSparis +" kez tercih edilmiştir");

    }
}
