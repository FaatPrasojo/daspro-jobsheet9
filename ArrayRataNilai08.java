import java.util.Scanner;
public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner prasojo = new Scanner(System.in);

        int[] nilahMhs = new int[10];
        double total = 0;
        double rata2;

        for (int i = 0; i < nilahMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilahMhs[i] = prasojo.nextInt();
        }
        for (int i = 0; i < nilahMhs.length; i++) {
            total += nilahMhs[i];
        }
        rata2 = total/nilahMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);
    }
}
