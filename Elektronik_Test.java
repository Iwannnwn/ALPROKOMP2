// Nama : Triwanto
// NRP  : 5002221070
// Kelas : Alpro 2 A

package Latihan_Abstrak;

public class Elektronik_Test {
    public static void main(String[] args) {
        Radio radio = new Radio();
        Televisi televisi = new Televisi();
        
        // Radio
        System.out.println("=====Radio======");
        radio.on();
        radio.gantiChannel(1);
        radio.perbesarVolume();
        radio.perkecilVolume();
        radio.off();
        
        // Televisi
        System.out.println("=====Televisi======");
        televisi.on();
        televisi.gantiChannel(1);
        televisi.perbesarVolume();
        televisi.perkecilVolume();
        televisi.off();
    }
}
