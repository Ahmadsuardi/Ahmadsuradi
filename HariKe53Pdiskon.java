import java.util.Scanner;
public class HariKe53pdiskon {
        public static double hDiskon(double harga, double diskon) {
        double x = harga * (diskon / 100);
        double hasil = harga - x;
        return hasil;
    }

    public static void tDiskon(double harga, double diskon) {
        System.out.println("harga barang  Rp:  " + harga);
        System.out.println("diskon          : " + diskon + " %");
        System.out.println("============================");
        System.out.println("total yang dibayar : " + hDiskon(harga, diskon));
    }

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        double harga, diskon, x;
        System.out.print("Input harga : Rp. ");
        harga = masuk.nextDouble();
        if (harga > 500000) {
            diskon = 15;

        } else if (harga > 100000) {
            diskon = 10;
        } else {
            diskon = 0;
        }
        System.out.println("==============================");
        tDiskon(harga, diskon);
    }
}
