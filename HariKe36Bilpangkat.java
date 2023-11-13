public class HariKe36Bilnganberpangkat {
public static void main(String[] args) {
        int angka, pangkat, hasil;
        angka = 5;
        pangkat = 3;
        hasil = angka;
        for (int b = 1; b < pangkat; b++) {
            hasil *= angka;  
        }
        System.out.println("Hasil");
        System.out.println("--------------");
        System.out.println("="+hasil);
    } 
}
