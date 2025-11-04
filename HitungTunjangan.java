import java.util.Scanner;

public class HitungTunjangan {
    
    // Fungsi untuk menghitung tunjangan
    static double hitungTunjangan(double gajiKotor, int jumlahAnak) {
        double tunjangan;
        if (jumlahAnak < 3) {
            tunjangan = 0.2 * gajiKotor; // 20%
        } else {
            tunjangan = 0.3 * gajiKotor; // 30%
        }
        return tunjangan;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double gajiKotor, tunjangan;
        int jumlahAnak;
        
        System.out.print("Masukkan gaji kotor: ");
        gajiKotor = input.nextDouble();
        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = input.nextInt();
        
        tunjangan = hitungTunjangan(gajiKotor, jumlahAnak);
        
        System.out.println("Besar tunjangan yang diterima: " + tunjangan);
        
        input.close();
    }
}
