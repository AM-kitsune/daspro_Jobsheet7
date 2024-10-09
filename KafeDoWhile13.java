import java.util.Scanner;

public class KafeDoWhile13 {
    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);
        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaTeh = 7000, hargaKopi = 12000, hargaRoti = 20000;

        do {
            System.out.print("Masukan nama pelangan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc13.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc13.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc13.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc13.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc13.nextLine();

        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}
