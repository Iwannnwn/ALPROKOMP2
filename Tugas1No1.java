import java.util.Scanner;

public class Tugas1No1 {
    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner input = new Scanner(System.in);
        
        // Input kata sandi dari Pengguna
        System.out.print("Masukkan kata sandi : ");
        String a = input.nextLine();
        
        // Memanggil method checking kata sandi
        System.out.println(Check(a));
    }

    // Method check
    public static String Check(String a){
        if (a.length() >= 8){
            int jumlahangka = 0;
            int jumlahhuruf = 0;
            int jumlahcharlain = 0;
            for(int i = 0; i < a.length();i++){
                // Ubah sandi ke karakter
                char b = a.charAt(i);
                
                // Check Karakter huruf dan angka dengan mendapatkan jumlahnya
                if (Huruf(b))
                    jumlahhuruf++;
                else if (Angka(b))
                    jumlahangka++;
                else if (CharLain(b))
                    jumlahcharlain++;
            }
                // Check jumlah angka, huruf dan karakter lain
                if (jumlahhuruf >= 2 && jumlahangka >= 2 && jumlahcharlain == 0)
                    return "Kata Sandi Valid";
                else
                    return "Kata Sandi Tidak valid";
        }
        else
            return "Kata Sandi Tidak valid";
    }
    
    // Method cek huruf
    public static boolean Huruf(char x){
          return(Character.isLetter(x));
    }
    
    // Method cek angka
    public static boolean Angka(char y){
        return(Character.isDigit(y));
    }
    
    // Method cek karakter lain
    public static boolean CharLain(char z){        
       return (!Character.isLetterOrDigit(z));
    }
}