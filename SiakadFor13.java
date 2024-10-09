import java.util.Scanner;

public class SiakadFor13 {
    public static void main(String[] args){
        Scanner sc13 = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++){
            System.out.print("Masukan nilai Mahasiswa ke- " + i + ": ");
            nilai =  sc13.nextDouble();
            if (nilai > tertinggi ) {
                tertinggi = nilai;
            }else if(nilai < terendah){
                terendah = nilai;
            }
        }

        System.out.println("Nilai Tertinggi: "+ tertinggi);
        System.out.println("Nilai Tertinggi: "+ terendah);
    }
}