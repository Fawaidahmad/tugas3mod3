package Tugas2;
import java.util.Scanner;

/**
 * Program sederhana untuk menghitung Zakat Mal (2.5% dari total kekayaan) dalam Rupiah.
 */
public class ZakatMalCalculator {

    /**
     * Metode utama program.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan total keseluruhan harta dalam Rupiah
        System.out.print("Masukkan total keseluruhan harta (dalam Rupiah): ");
        double totalHarta = input.nextDouble();

        // Menghitung Zakat Mal (2.5% dari total kekayaan)
        double zakatMal = totalHarta * 0.025; // 2.5% diwakili sebagai 0.025 dalam kode

        // Menampilkan jumlah Zakat Mal yang harus diberikan
        System.out.println("Jumlah Zakat Mal yang harus diberikan: " + zakatMal + " Rupiah");
        System.out.println("Terima kasih");
        input.close();
    }
}

