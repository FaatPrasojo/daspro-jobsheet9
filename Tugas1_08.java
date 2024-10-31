import java.util.Scanner;
public class Tugas1_08 {
    public static void main(String[] args) {
        Scanner prasojo = new Scanner(System.in);
        double total = 0, tertinggi = 0, terendah = 100;
        double rata2;
        int jmlMhs;

        System.out.print("Masukkan jumlah Mahasiswa : ");
        jmlMhs = prasojo.nextInt();
        System.out.println("=============================================================");
        int[] nilaiMhs = new int [jmlMhs];
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = prasojo.nextInt();
        }
        System.out.println("=============================================================");
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " : " + nilaiMhs[i]);
            total += nilaiMhs[i];
            if (nilaiMhs [i] > tertinggi) {
                tertinggi = nilaiMhs [i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
         }
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        rata2 = total/ jmlMhs;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("=============================================================");
    }
}
