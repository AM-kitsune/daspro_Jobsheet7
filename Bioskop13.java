import java.util.Scanner;

public class Bioskop13 {
    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0.0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik '0' untuk Membatalkanm : ");
            int totalTiket = sc13.nextInt();
            double hargaTotal = totalTiket * hargaTiket;
            double diskon = 0.0;
            double hargaTotalDisc = hargaTotal * (1 - diskon);

            if (totalTiket == 0) {
                break;
            }
            if (totalTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan jumlah yang benar.");
                continue;
            }
            
            if (totalTiket > 10) {
                diskon = 0.15;
            } else if (totalTiket > 4) {
                diskon = 0.10;
            }

            totalTiketTerjual += totalTiket;
            totalPenjualan += hargaTotalDisc;

            System.out.println("Harga total untuk " + totalTiket + " tiket adalah: Rp " + hargaTotalDisc);
        }
        System.out.println("====================================");
        System.out.println("Total tiket Yang terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan tiket: Rp " + totalPenjualan);
    }
}