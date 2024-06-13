// Nama : Triwanto
// NRP  : 5002221070
// Kelas : Alpro 2 A

package Latihan_Abstrak;

// Interface Mobil
interface interfaceMobil{
    public void NyalakanMesin();
    public void MatikanMesin();
    public void TambahkanGerigi();
    public void TurunkanGerigi();
    public void TekanGas();
    public void TekanRem();
}

// Interface Sirine
interface interfaceSirine{
    public void NyalakanSirine();
    public void MatikanSirine();
    public int GantiSuaraSirine(int Jenis);
}

// Class Mobil implementasi interfaceMobil
class Mobil implements interfaceMobil{
    protected boolean mesin = false;

    public void NyalakanMesin(){
        mesin = true;
        System.out.println("Mesin Menyala");    
    }

    public void MatikanMesin(){
        mesin = false;
        System.out.println("Mesin Mati");
    }

    public void TambahkanGerigi(){
        System.out.println("Gerigi Ditambahkan");
    }

    public void TurunkanGerigi(){
        System.out.println("Gerigi Diturunkan");
    }

    public void TekanGas(){
        System.out.println("Gas Ditekan");
    }

    public void TekanRem(){
        System.out.println("Rem Ditekan");
    }
}

// Class MobilPribadi subclass dari Mobil
class MobilPribadi extends Mobil{
    public void NyalakanTape(){
        System.out.println("Tape Menyala");
    }

    public void NyalakanTV(){
        System.out.println("TV Menyala");
    }

    public void NyalakanAC(){
        System.out.println("AC Menyala");
    }

    public void NyalakanMesin(){
        mesin = true;
        System.out.println("Mesin Mobil Pribadi Menyala");
    }

    public void MatikanMesin(){
        mesin = false;
        System.out.println("Mesin Mobil Pribadi Mati");
    }

    public void TambahGerigi(){
        System.out.println("Gerigi Mobil Pribadi Ditambahkan");
    }

    public void TurunkanGerigi(){
        System.out.println("Gerigi Mobil Pribadi Diturunkan");
    }

    public void TekanGas(){
        System.out.println("Gas Mobil Pribadi Ditekan");
    }

    public void TekanRem(){
        System.out.println("Rem Mobil Pribadi Ditekan");
    }
}

// Class MobilTransportasi subclass dari Mobil
class MobilTransportasi extends Mobil {
    protected int jmlKursi;

    public void TambahPenumpang(){
        jmlKursi++;
        System.out.println("Penumpang Ditambahkan");
    }
}

// Class Bus subclass dari MobilTransportasi
class Bus extends MobilTransportasi{
    public void NyalakanTape(){
        System.out.println("Tape Bus Menyala");
    }

    public void NyalakanTV(){
        System.out.println("TV Bus Menyala");
    }

    public void NyalakanAC(){
        System.out.println("AC Bus Menyala");
    }

    public void NyalakanMesin(){
        mesin = true;
        System.out.println("Mesin Bus Menyala");
    }

    public void MatikanMesin(){
        mesin = false;
        System.out.println("Mesin Bus Mati");
    }

    public void TambahGerigi(){
        System.out.println("Gerigi Bus Ditambahkan");
    }

    public void TurunkanGerigi(){
        System.out.println("Gerigi Bus Diturunkan");
    }

    public void TekanGas(){
        System.out.println("Gas Bus Ditekan");
    }

    public void TekanRem(){
        System.out.println("Rem Bus Ditekan");
    }

    public void TambahPenumpang(){
        jmlKursi++;
        System.out.println("Penumpang Bus Ditambahkan");
    }
}

// Class MobilNegara subclass dari Mobil
class MobilNegara extends Mobil implements interfaceSirine{
    public void NyalakanSirine(){
        System.out.println("Sirine Mobil Negara Menyala");
    }

    public void MatikanSirine(){
        System.out.println("Sirine Mobil Negara Dimatikan");
    }

    public int GantiSuaraSirine(int Jenis){
        System.out.println("Suara Sirine Mobil Negara Diganti");
        return Jenis;
    }

    public void NyalakanTape(){
        System.out.println("Tape Mobil Negara Menyala");
    }

    public void NyalakanTV(){
        System.out.println("TV Mobil Negara Menyala");
    }

    public void NyalakanAC(){
        System.out.println("AC Mobil Negara Menyala");
    }
}

// Class Ambulance subclass dari MobilNegara
class Ambulance extends MobilNegara{
    public void NyalakanTape(){
        System.out.println("Tape Ambulance Menyala");
    }

    public void NyalakanTV(){
        System.out.println("TV Ambulance Menyala");
    }

    public void NyalakanAC(){
        System.out.println("AC Ambulance Menyala");
    }

    public void NyalakanMesin(){
        mesin = true;
        System.out.println("Mesin Ambulance Menyala");
    }

    public void MatikanMesin(){
        mesin = false;
        System.out.println("Mesin Ambulance Mati");
    }

    public void TambahGerigi(){
        System.out.println("Gerigi Ambulance Ditambahkan");
    }

    public void TurunkanGerigi(){
        System.out.println("Gerigi Ambulance Diturunkan");
    }

    public void TekanGas(){
        System.out.println("Gas Ambulance Ditekan");
    }

    public void TekanRem(){
        System.out.println("Rem Ambulance Ditekan");
    }

    public void NyalakanSirine(){
        System.out.println("Sirine Ambulance Menyala");
    }

    public void MatikanSirine(){
        System.out.println("Sirine Ambulance Dimatikan");
    }

    public int GantiSuaraSirine(int Jenis){
        System.out.println("Suara Sirine Ambulance Diganti");
        return Jenis;
    }
}

// Class MobilPolisi subclass dari MobilNegara
class MobilPolisi extends MobilNegara{
    public void NyalakanTape(){
        System.out.println("Tape Mobil Polisi Menyala");
    }

    public void NyalakanTV(){
        System.out.println("TV Mobil Polisi Menyala");
    }

    public void NyalakanAC(){
        System.out.println("AC Mobil Polisi Menyala");
    }

    public void NyalakanMesin(){
        mesin = true;
        System.out.println("Mesin Mobil Polisi Menyala");
    }

    public void MatikanMesin(){
        mesin = false;
        System.out.println("Mesin Mobil Polisi Mati");
    }

    public void TambahGerigi(){
        System.out.println("Gerigi Mobil Polisi Ditambahkan");
    }

    public void TurunkanGerigi(){
        System.out.println("Gerigi Mobil Polisi Diturunkan");
    }

    public void TekanGas(){
        System.out.println("Gas Mobil Polisi Ditekan");
    }

    public void TekanRem(){
        System.out.println("Rem Mobil Polisi Ditekan");
    }

    public void NyalakanSirine(){
        System.out.println("Sirine Mobil Polisi Menyala");
    }

    public void MatikanSirine(){
        System.out.println("Sirine Mobil Polisi Dimatikan");
    }

    public int GantiSuaraSirine(int Jenis){
        System.out.println("Suara Sirine Mobil Polisi Diganti");
        return Jenis;
    }
}



