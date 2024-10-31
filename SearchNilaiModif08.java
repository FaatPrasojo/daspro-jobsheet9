import java.util.Scanner;
public class SearchNilaiModif08 {
    public static void main(String[] args) {
        Scanner prasojo = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int jmlMhs = prasojo.nextInt();

        int[] arrNilai = new int [jmlMhs];
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            arrNilai[i] = prasojo.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = prasojo.nextInt();
        int hasil=0;
        for(int i=0;i<jmlMhs;i++){
            if (key == arrNilai[i]){
                hasil=i;
                System.out.println();
                System.out.println("Nilai " + key + " ketemu di indeks ke-"+hasil);
                System.out.println();
                break;
            }else
            System.out.println();
            System.out.println("Nilai yang dicari tidak ditemukan" );
            System.out.println();
            break;
        }
    }
    
}
