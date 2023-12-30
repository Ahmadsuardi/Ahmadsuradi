import java.util.*;
public class ArrayjmlGanjil {
public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan jumlah Index : ");
        int index = masuk.nextInt();
        int[] bilangan = new int[index];
        int jumlah = 0;
        System.out.println("Masukkan Angka : ");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print("Angka -" + (i + 1) + " : ");
            bilangan[i] = masuk.nextInt();
        }
        System.out.print("Jumlah Angka Ganjil dari Array Tersebut : ");
        for (int i : bilangan) {
            if (i % 2 == 1) {
                jumlah += i;
            }
        }
        System.out.println(jumlah);
    }
}
