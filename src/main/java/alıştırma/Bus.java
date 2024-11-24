package alıştırma;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    public String firma;
    public String plaka;
    public byte peron;

    List<String> koltukSayısı= new ArrayList<>();

    public Bus(String firma, String plaka, byte peron){
        this.peron=peron;
        this.firma=firma;
        this.plaka=plaka;

        for (int i = 1; i < 33 ; i++) {
            koltukSayısı.add(String.valueOf(i));


        }
    }

}
