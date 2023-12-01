import java.util.Scanner;
public class HariKe54Psegitiga {
    static void Psegitiga(int jml) {
        for (int i = 0; i <= jml; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("o ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int jml = input.nextInt();
        Psegitiga(jml);
    }
}
