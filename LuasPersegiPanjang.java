import java.util.Scanner;

public class LuasPersegiPanjang {
    
    // Fungsi untuk menghitung luas
    static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int panjang, lebar, luas;
        
        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();
        
        luas = hitungLuas(panjang, lebar);
        
        System.out.println("Luas persegi panjang adalah: " + luas);
        
        input.close();
    }
}
