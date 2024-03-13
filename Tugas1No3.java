import java.util.Scanner;

public class Tugas1No3 {
    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner input = new Scanner(System.in);
        
        // Input pengguna untuk i
        System.out.print("Masukkan i : ");
        int i = input.nextInt();

        // Memanggil Method jumlahan deret untuk i yang dimasukan pengguna
        System.out.println("====== i Input User ======");
        System.out.println("m(i) = " + 4*Deret(i));

        // Memanggil Method jumlahan deret untuk i = {1,201,301,401}
        System.out.println("====== i Dari Array ======");
        int [] x = {1,201,301,401};
        for (int n = 0; n < x.length ;n++)
           System.out.println("i = " + x[n] +" | m(i) = " + 4*Deret(x[n]));
    }
    
    // Method untuk menghitung deret ke-n
    public static double Deret(int i){
        double jumlah = 0;
        for (int n = 1; n <= i; n++){
            double suku = Math.pow(-1, n + 1) / (2.0 * n - 1);
            jumlah += suku;
        }
        return jumlah;
    } 
}
