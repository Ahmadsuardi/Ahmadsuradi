 java.util.Scanner;
public class HariKe40Mencaridata {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 4, 5, 6};
        int cari, salah = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("data : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.print("cari : ");
        cari = input.nextInt();
        System.out.println("-----------");
        System.out.println("Hasil : ");
        for (int i = 0; i < a.length; i++) {
            if (cari == a[i]) {
                System.out.println("index-" + i);
                salah++;
            }
        }
        if (salah == 0) {
            System.out.println("Data tidak ditemukan : ");
        }
    }
}
