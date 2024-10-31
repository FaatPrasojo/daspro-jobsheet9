import java.util.Scanner;
public class ArrayNilai {
    public static void main(String[] args) {
        Scanner prasojo = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = prasojo.nextInt();
        }for (int i = 0; i < 10; i++) {
            System.out.println("Nilai Akhir ke-" + i + " adalah " + nilaiAkhir[i]);
        }
    }
}