package inheritance;

public class Vehicle {
            /*Constructor Hiyerarsisi- Child class'tan bir object olusturdugunuzda constructor'lar
        en ustteki parent class'tan baslatilarak alta doğru calistirilir*/

    //Constructor olusturalim
    public Vehicle(){
        this("Honda",2024, "Elektrikli");
        System.out.println("Hond, 2023, Benzin");
    }

    public Vehicle(String marka, int yıl, String yakıt){ //4
        super();
        System.out.println("Honda, 2024, Elektrikli");
    }
}
