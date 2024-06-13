// Nama : Triwanto
// NRP  : 5002221070
// Kelas : Alpro 2 A

package Latihan_Abstrak;

public class Mobil_Test {
    public static void main(String [] args){
        MobilPribadi mobilPribadi = new MobilPribadi();
        Bus bus = new Bus();
        Ambulance ambulance = new Ambulance();
        MobilPolisi mobilPolisi = new MobilPolisi();
        
        // MobilPribadi
        System.out.println("=====Mobil Pribadi======");
        mobilPribadi.NyalakanMesin();
        mobilPribadi.TambahkanGerigi();
        mobilPribadi.TekanGas();
        mobilPribadi.TekanRem();
        mobilPribadi.NyalakanTape();
        mobilPribadi.NyalakanTV();
        mobilPribadi.NyalakanAC();
    
        // Bus
        System.out.println("=====Bus======");
        bus.NyalakanMesin();
        bus.TambahkanGerigi();
        bus.TekanGas();
        bus.TekanRem();
        bus.NyalakanTape();
        bus.NyalakanTV();
        bus.NyalakanAC();
        bus.TambahPenumpang();
        
        // Ambulance
        System.out.println("=====Ambulance======");
        ambulance.NyalakanMesin();
        ambulance.TambahkanGerigi();
        ambulance.TekanGas();
        ambulance.TekanRem();
        ambulance.NyalakanTape();
        ambulance.NyalakanTV();
        ambulance.NyalakanAC();
        ambulance.NyalakanSirine();
        ambulance.MatikanSirine();
        ambulance.GantiSuaraSirine(1);
    
        // MobilPolisi
        System.out.println("=====Mobil Polisi======");
        mobilPolisi.NyalakanMesin();
        mobilPolisi.TambahkanGerigi();
        mobilPolisi.TekanGas();
        mobilPolisi.TekanRem();
        mobilPolisi.NyalakanTape();
        mobilPolisi.NyalakanTV();
        mobilPolisi.NyalakanAC();
        mobilPolisi.NyalakanSirine();
        mobilPolisi.MatikanSirine();
        mobilPolisi.GantiSuaraSirine(2);
    }
}
