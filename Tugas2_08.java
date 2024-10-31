import java.util.Scanner;
public class Tugas2_08 {
    public static void main(String[] args) {
        Scanner prasojo = new Scanner(System.in);
        int jmlPesanan;
        double total = 0;

        System.out.println("=========================================");
        System.out.println("---------------Daftar menu---------------");
        System.out.println("1. Martabak");
        System.out.println("2. Pempek");
        System.out.println("3. Susu");
        System.out.println("4. Joshua ");
        System.out.println("=========================================");
        System.out.print("Masukkan jumlah pesanan: ");
        jmlPesanan = prasojo.nextInt();

        String [] namaPesanan = new String[jmlPesanan];
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukkan pesanan ke-" + (i+1) + " : ");
            namaPesanan[i] = prasojo.nextLine();
            prasojo.nextLine(); 
        }
        System.out.println("=========================================");
        int[] harga = new int[jmlPesanan];
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukkan harga pesanan ke-" + (i+1) + " : ");
            harga[i] = prasojo.nextInt();
            total += harga[i];
        }
        System.out.println("=========================================");
        System.out.println("Daftar pesanan yang dipesan : ");
        for ( int i = 0 ; i < namaPesanan.length; i++) {
            System.out.println((i + 1) + ". "+ namaPesanan[i]);
        }
        System.out.println("Total biaya dari semua pesanan : " + total);
        System.out.println("=========================================");
    }
}
