import java.util.Scanner;
public class ArrayRataNilaiModif08 {
    public static void main(String[] args) {
        Scanner prasojo = new Scanner(System.in);
        double total = 0;
        double rata2;
        int jmlMhs;

        System.out.print("Masukkan jumlah Mahasiswa : ");
        jmlMhs = prasojo.nextInt();

        int[] nilaiMhs = new int [jmlMhs];
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilaiMhs[i] = prasojo.nextInt();
            
        }
        int jmlLulus = 0;
        for (int i = 0; i < jmlMhs; i++) {
            total += nilaiMhs[i];
                if (nilaiMhs[i] > 70) {
                    jmlLulus++;
            }
        }
        System.out.println("Jumlah mahasiswa yang lulus : " + jmlLulus);
        rata2 = total/ jmlMhs;
        System.out.println("Rata-rata nilai = " + rata2);

    }
}
