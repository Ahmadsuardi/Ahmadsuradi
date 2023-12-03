import java.util.Scanner;
public class HariKe56PolaPersegi {
        static void PolaPersegi(int tinggi) {
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < tinggi; j++) {
                System.out.print("o ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print(" Masukka angka : ");
        int panjang = masuk.nextInt();
        PolaPersegi(panjang);
    }
}
