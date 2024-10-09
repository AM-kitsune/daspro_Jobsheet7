import java.util.Scanner;

public class SiakadFor13 {
    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;
        int batasKelulusan = 60; 

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + i + ": ");
            nilai = sc13.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= batasKelulusan) {
                lulus++; 
            } else {
                tidakLulus++; 
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidakLulus);

    }
}
