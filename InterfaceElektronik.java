// Nama : Triwanto
// NRP  : 5002221070
// Kelas : Alpro 2 A

package Latihan_Abstrak;

// Ini Blok Interface
interface InterfaceElektronik {
    public void on();
    public void off();
}

interface interfaceChannelTV{
    public int gantiChannel(int c);
}

interface interfaceChannelRadio{
    public int gantiChannel(int c);
}

// Ini Blok Class
// Class Radio implementasi InterfaceElektronik dan interfaceChannelRadio
class Radio implements InterfaceElektronik, interfaceChannelRadio{
    protected boolean mesin = false;
    protected int volume = 0;

    public void on(){
        mesin = true;
        System.out.println("Radio Menyala");
    }

    public void off(){
        mesin = false;
        System.out.println("Radio Mati");
    }

    public int gantiChannel(int c){
        System.out.println("Channel Radio diganti ke " + c);
        return c;
    }

    public void perbesarVolume(){
        volume++;
        System.out.println("Volume Radio diperbesar");
    }

    public void perkecilVolume(){
        volume--;
        System.out.println("Volume Radio diperkecil");
    }
}

// Class Televisi implementasi InterfaceElektronik dan interfaceChannelTV
class Televisi implements InterfaceElektronik, interfaceChannelTV{
    protected boolean mesin = false;
    protected boolean listrik = false;
    protected String merk = "Polytron";
    protected int volume = 0;

    public void on(){
        listrik = true;
        mesin = true;
        System.out.println("Televisi Merk " + merk + " dinyalakan");
    }

    public void off(){
        listrik = false;
        mesin = false;
        System.out.println("Televisi Merk " + merk + " dimatikan");
    }

    public int gantiChannel(int c){
        System.out.println("Channel TV diganti ke " + c);
        return c;
    }

    public void perbesarVolume(){
        volume++;
        System.out.println("Volume TV diperbesar");
    }

    public void perkecilVolume(){
        volume--;
        System.out.println("Volume TV diperkecil");
    }
}